package ru.ajana.work.pattern.behavior.visitor;

/**
 * Конкретный класс элемент B.
 *
 * @author Andrey Kharintsev on 17.03.2019
 */
public class ConcreteElementB implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitElementB(this);
  }
}
