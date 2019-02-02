package ru.ajana.deployer.parser;


import java.io.IOException;
import java.io.InputStream;
import javax.xml.transform.stax.StAXSource;
import org.apache.commons.io.IOUtils;
import org.apache.maven.pom._4_0.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Парсер Maven POM.XML
 *
 * @author Andrey Kharintsev on 01.02.2019
 */
public class PomParser {

  private static final Logger LOG = LoggerFactory.getLogger(PomParser.class);

  public static void main(String[] args) {
    try {

      InputStream in = PomParser.class.getClassLoader().getResourceAsStream("pom/sample-pom.xml");
      String xml = IOUtils.toString(in, "UTF-8");
      //Model model = JAXB.unmarshal(in, Model.class);
      Model model = UnmarshalUtils.unmarshal(xml, "project", Model.class);
      LOG.info("version: {}", model.getVersion());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
