package ru.ajana.work.pattern.generate.factorymethod;

/**
 * Конкретный создатель продукта.
 *
 * @author Andrey Kharintsev on 24.11.2018
 */
public class ConcreteCreator extends Creator {

  @Override
  public Product factoryMethod() {
    return new ConcreteProduct();
  }
}
