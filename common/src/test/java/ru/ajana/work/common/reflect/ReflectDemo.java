package ru.ajana.work.common.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import org.junit.Test;

/**
 * @author Andrey Kharintsev on 10.03.2018
 */
public class ReflectDemo {

  @Test
  public void testInvokePrivate() throws Exception {
    // Вызов private метода
    ClassLoader cl = this.getClass().getClassLoader();
    Method mthd = MyClass.class.getDeclaredMethod(
        "getValue", new Class[0]);

    AccessibleObject.setAccessible(new AccessibleObject[]{mthd}, true);

    MyClass obj = MyClass.class.newInstance();
    // Try to get the caller's class-loader
    String value = (String) mthd.invoke(obj);
    //String value = (String) mthd.invoke(cl);
    System.out.println(value);
  }
}
