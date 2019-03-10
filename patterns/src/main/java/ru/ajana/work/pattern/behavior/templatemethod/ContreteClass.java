package ru.ajana.work.pattern.behavior.templatemethod;

/**
 * Конкретный класс.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class ContreteClass extends AbstractClass {
  @Override
  protected void subMethod() {
    System.out.println("Init ContreteClass");
  }
}
