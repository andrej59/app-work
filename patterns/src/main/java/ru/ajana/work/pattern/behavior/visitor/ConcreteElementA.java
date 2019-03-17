package ru.ajana.work.pattern.behavior.visitor;

/**
 * Конкретный элемент A/
 *
 * @author Andrey Kharintsev on 17.03.2019
 */
public class ConcreteElementA implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitElementA(this);
  }
}
