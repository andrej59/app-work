package ru.ajana.work.common.interfaces;

/**
 * @author Andrey Kharintsev on 18.07.2018
 */
public interface InterfaceClass {

  public abstract String func1();

  public String func2();

  public String func3();

  default String func4() {
    return "123";
  }

  static String func5() {
    return "123";
  }
}
