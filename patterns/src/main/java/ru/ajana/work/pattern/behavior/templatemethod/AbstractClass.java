package ru.ajana.work.pattern.behavior.templatemethod;

/**
 * Абстрактный класс.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public abstract class AbstractClass {

  public void templateMethod() {
    System.out.println("templateMethod");
    subMethod();
  }

  /**
   * Замещающий абстрактный метод.
   */
  protected  void subMethod() {
    System.out.println("Init subMethod default");
  }
}
