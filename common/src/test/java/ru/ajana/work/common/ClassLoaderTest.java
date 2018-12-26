package ru.ajana.work.common;

import org.junit.Ignore;
import org.junit.Test;
import ru.ajana.work.common.classloader.JarClassLoader;


/**
 * Created by Андрей on 20.12.2015.
 */
public class ClassLoaderTest {

  @Ignore
  @Test
  public void testLoad() throws ClassNotFoundException {

    ClassLoader.getSystemClassLoader().loadClass(BlackBox.class.getName());
    ClassLoader.getSystemClassLoader().loadClass(BlackBox.class.getName());

    // Создаем загрузчик

    JarClassLoader jarClassLoader = new JarClassLoader();

    // Загружаем класс

    Class<?> clazz1 = jarClassLoader.loadClass("BlackBox");
    Class<?> clazz2 = jarClassLoader.loadClass("BlackBox");
    System.out.println("clazz1: " + clazz1);
    System.out.println("clazz2: " + clazz2);
    //IJarSample sample = (IJarSample) clazz.newInstance();
    //sample.demo("Test");
  }
}
