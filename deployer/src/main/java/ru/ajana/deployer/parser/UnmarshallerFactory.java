package ru.ajana.deployer.parser;


import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * @author Andrey Kharintsev on 01.02.2019
 */
public class UnmarshallerFactory {

  private static final Logger LOG = LoggerFactory.getLogger(UnmarshallerFactory.class);
  private static final UnmarshallerFactory instance = new UnmarshallerFactory();

  private UnmarshallerFactory() {
  }

  public static UnmarshallerFactory getInstance() {
    return instance;
  }

  public <T> Unmarshaller getUnmarshaller(final Class<T> clazz) throws SAXException {
    return getUnmarshaller(clazz, null, null);
  }

  public Unmarshaller getUnmarshaller(final JAXBContext jaxbCtx
  ) throws JAXBException, SAXException {
    return getUnmarshaller(jaxbCtx, null, null);
  }

  public Unmarshaller getUnmarshaller(final JAXBContext jaxbCtx,
      ValidationEventHandler eventHandler) throws JAXBException, SAXException {
    return getUnmarshaller(jaxbCtx, eventHandler, null);
  }

  /**
   * Возвращает объект Unmarshaller.
   *
   * @param clazz класс объекта
   * @param schema XSD - схема контекста
   * @return объект Unmarshaller
   */
  public <T> Unmarshaller getUnmarshaller(final Class<T> clazz, final Source... schema)
      throws SAXException {
    return getUnmarshaller(clazz, null, schema);
  }

  public <T> Unmarshaller getUnmarshaller(final Class<T> clazz, ValidationEventHandler eventHandler)
      throws SAXException {
    return getUnmarshaller(clazz, eventHandler, null);
  }

  public <T> Unmarshaller getUnmarshaller(final Class<T> clazz, ValidationEventHandler eventHandler,
      final Source... schema
  ) throws SAXException {
    try {
      final JAXBContextFactory contextFactory = JAXBContextFactory.getInstance();
      final JAXBContext jaxbCtx = contextFactory.getJaxbPackageContext(clazz);
      return getUnmarshaller(jaxbCtx, eventHandler, schema);
    } catch (JAXBException e) {
      LOG.error("Error create unmarshaller", e);
    }
    return null;
  }


  public Unmarshaller getUnmarshaller(final JAXBContext jaxbCtx,
      final ValidationEventHandler eventHandler,
      final Source... sourceSchema
  ) throws SAXException, JAXBException {
    final Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
    if (sourceSchema != null) {
      final SchemaFactory schemaFactory = SchemaFactory
          .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
      final Schema schema;
      try {
        schema = schemaFactory.newSchema(sourceSchema);
        unmarshaller.setSchema(schema);
      } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
        LOG.error("Error create marshaller", e);
      }
    }
    if (eventHandler != null) {
      unmarshaller.setEventHandler(eventHandler);
    }
    return unmarshaller;
  }
}
