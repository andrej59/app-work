package ru.ajana.work.common.exception;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Andrey Kharintsev on 15.03.2018
 */
public class ExceptionStaticDemoTest {

  static {
    //ExceptionStaticDemo.methodStatic();
  }

  @Ignore
  @Test
  public void testMethodStatic() {
    ExceptionStaticDemo.methodStatic();
    //ExceptionStaticDemo staticDemo = new ExceptionStaticDemo();
    //staticDemo.methodStatic();
  }
}