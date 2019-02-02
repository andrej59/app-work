package ru.ajana.deployer.parser;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * @author Andrey Kharintsev on 01.02.2019
 */
public class JAXBContextFactory {

  private static final ConcurrentMap<String, JAXBContext> jaxbContexts = new ConcurrentHashMap<>();
  private static final JAXBContextFactory instance = new JAXBContextFactory();

  private JAXBContextFactory() {
  }

  public static JAXBContextFactory getInstance() {
    return instance;
  }

  public JAXBContext getJaxbClazzContext(final Class<?> clazz) {
    return createJaxbContext(clazz, false);
  }

  public JAXBContext getJaxbPackageContext(final Class<?> clazz) {
    return createJaxbContext(clazz, true);
  }

  /**
   * Создаёт  JAXB контекст.
   *
   * @param clazz класс объекта.
   * @param isCtxPackage true - создаёт контекст пакета, false - контекст объекта.
   * @return контекст объекта.
   */
  private JAXBContext createJaxbContext(final Class<?> clazz, boolean isCtxPackage) {
    JAXBContext ctx;
    String key;
    if (isCtxPackage) {
      key = clazz.getPackage().getName();
    } else {
      key = clazz.getName();
    }
    ctx = jaxbContexts.get(key);
    if (ctx == null) {
      try {
        if (isCtxPackage) {
          ctx = JAXBContext.newInstance(key);
        } else {
          ctx = JAXBContext.newInstance(clazz);
        }
        jaxbContexts.putIfAbsent(key, ctx);
      } catch (JAXBException ex) {
        throw new RuntimeException(
            "Could not instantiate JAXBContext for contextPath [" + key + "]: " + ex
                .getMessage(), ex);
      }
    }
    return ctx;
  }
}
