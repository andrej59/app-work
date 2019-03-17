package ru.ajana.work.pattern.behavior.visitor;

/**
 * Конкретный класс посетитель.
 *
 * @author Andrey Kharintsev on 17.03.2019
 */
public class ConcreteVisitor implements Visitor {

  @Override
  public void visitElementA(ConcreteElementA elementA) {
    System.out.println("visit elementA");
  }

  @Override
  public void visitElementB(ConcreteElementB elementB) {
    System.out.println("visit elementB");
  }
}
