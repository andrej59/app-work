package ru.ajana.work.pattern.behavior.visitor;

/**
 * Интерфейс элемента.
 *
 * @author Andrey Kharintsev on 17.03.2019
 */
public interface Element {
  void accept(Visitor visitor);
}
