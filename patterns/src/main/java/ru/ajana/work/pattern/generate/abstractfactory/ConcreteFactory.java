package ru.ajana.work.pattern.generate.abstractfactory;

/**
 * Класс конкретной фабрики.
 *
 * @author Andrey Kharintsev on 24.11.2018
 */
public class ConcreteFactory implements AbstractFactory {

  @Override
  public AbstractProduct createProductA() {
    return new ConcreteProductA();
  }

  @Override
  public AbstractProduct createProductB() {
    return new ConcreteProductB();
  }
}
