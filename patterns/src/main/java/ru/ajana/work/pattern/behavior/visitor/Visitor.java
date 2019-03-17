package ru.ajana.work.pattern.behavior.visitor;

/**
 * Интерфейс посетителя.
 *
 * @author Andrey Kharintsev on 17.03.2019
 */
public interface Visitor {

  void visitElementA(ConcreteElementA elementA);

  void visitElementB(ConcreteElementB elementB);
}
