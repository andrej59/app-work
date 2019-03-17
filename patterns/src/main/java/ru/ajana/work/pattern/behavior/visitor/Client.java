package ru.ajana.work.pattern.behavior.visitor;

/**
 * @author Andrey Kharintsev on 17.03.2019
 */
public class Client {

  public static void main(String[] args) {
    Visitor visitor = new ConcreteVisitor();

    new ConcreteElementA().accept(visitor);
    new ConcreteElementB().accept(visitor);
  }
}
