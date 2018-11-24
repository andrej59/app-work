package ru.ajana.work.pattern.generate.abstractfactory;

/**
 * @author Andrey Kharintsev on 24.11.2018
 */
public class ConcreteProductA implements AbstractProduct {

  private String name = "Продукт - A";

  @Override
  public String getName() {
    return name;
  }
}
