package ru.ajana.work.exception;

/**
 * @author Andrey Kharintsev on 15.03.2018
 */
public class ExceptionStaticDemo {


  public static void methodStatic() {
    throw new UserException("methodStatic");
  }

  public void method() {

  }
}
