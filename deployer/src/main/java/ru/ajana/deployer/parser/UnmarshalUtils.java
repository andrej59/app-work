package ru.ajana.deployer.parser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * @author Andrey Kharintsev on 01.02.2019
 */
public class UnmarshalUtils {

  /**
   * Кодировка по умолчанию.
   */
  private static final String DEFAULT_CHARSET_NAME = "UTF-8";

  public static Element unmarshal(final String xml) {
    return unmarshal(xml, DEFAULT_CHARSET_NAME);
  }

  public static Element unmarshal(final String xml, final String encoding) {
    try {
      if (xml == null || xml.length() == 0) {
        throw new IllegalArgumentException("The argument xml is not must be empty");
      }
      final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      dbf.setNamespaceAware(true);
      final DocumentBuilder db = dbf.newDocumentBuilder();
      final byte[] bytes = encoding == null ? xml.getBytes() : xml.getBytes(encoding);
      final Document doc = db.parse(new ByteArrayInputStream(bytes));
      return (Element) doc.getDocumentElement();
    } catch (ParserConfigurationException | SAXException | IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> T unmarshal(final String xml, final Class<T> cls) {
    return unmarshal(xml.getBytes(), cls);
  }

  public static <T> T unmarshal(final String xml, final Class<T> cls, final Source... schema) {
    return unmarshal(xml.getBytes(), cls, schema);
  }

  public static <T> T unmarshal(final byte[] bytes, final Class<T> cls) {
    return unmarshal(bytes, cls, null);
  }

  public static <T> T unmarshal(final byte[] bytes, final Class<T> cls, final Source... schema) {
    final StreamSource source = new StreamSource(new StringReader(new String(bytes)));
    return unmarshal(source, cls, schema);
  }

  public static <T> T unmarshal(final Source source, final Class<T> cls) {
    return JAXB.unmarshal(source, cls);
  }

  public static <T> T unmarshal(final Source source, final Class<T> cls, final Source... schema) {
    final UnmarshallerFactory factory = UnmarshallerFactory.getInstance();
    try {
      Unmarshaller unmarshaller = factory.getUnmarshaller(cls, schema);
      return (T) unmarshaller.unmarshal(source);
    } catch (SAXException | JAXBException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Выполняет демаршалинг xml - строки.
   *
   * @param xml xml - данные всего объекта
   * @param element элемент объекта
   * @param cls класс объекта
   * @return объект класса {@code cls}
   */
  public static <T> T unmarshal(final String xml, final String element,
      final Class<T> cls) {
    return unmarshal(new StreamSource(new StringReader(xml)), element, cls);
  }

  /**
   * Выполняет демаршалинг из любого источника данных.
   *
   * @param source источник данных
   * @param element элемент объекта
   * @param cls класс объекта
   * @return объект класса {@code cls}
   */
  public static <T> T unmarshal(final Source source, final String element,
      final Class<T> cls) {
    return unmarshal(source, element, cls, null);
  }

  public static <T> T unmarshal(final Source source, final String element,
      final Class<T> cls, final Source... sourceSchema) {
    final T value;
    XMLStreamReader xsr = null;
    try {
      final XMLInputFactory xif = XMLInputFactory.newFactory();
      xsr = xif.createXMLStreamReader(source);
      do {
        xsr.nextTag();
      } while (!xsr.getLocalName().equals(element));

      final JAXBContextFactory contextFactory = JAXBContextFactory.getInstance();
      final JAXBContext ctx = contextFactory.getJaxbPackageContext(cls);
      final Unmarshaller unmarshaller = ctx.createUnmarshaller();

      if (sourceSchema != null) {
        final SchemaFactory schemaFactory = SchemaFactory
            .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        final Schema schema = schemaFactory.newSchema(sourceSchema);
        unmarshaller.setSchema(schema);
      }

      final JAXBElement<T> xmlElement = unmarshaller.unmarshal(xsr, cls);
      value = xmlElement.getValue();
    } catch (XMLStreamException | SAXException | JAXBException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        xsr.close();
      } catch (XMLStreamException e) {
        throw new RuntimeException(e);
      }
    }
    return value;
  }
}
