package ru.ajana.work.pattern.generate.factorymethod;

/**
 * Конкретный продукт.
 *
 * @author Andrey Kharintsev on 24.11.2018
 */
public class ConcreteProduct implements Product {

  private String name = "Продукт";

  @Override
  public String getName() {
    return name;
  }
}
