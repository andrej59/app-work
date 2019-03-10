package ru.ajana.work.pattern.behavior.iterator;

import java.util.Collections;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class AppContext {

  public static void main(String[] args) {
    Aggregate aggregate = new ConcreteAggregate(Collections.EMPTY_LIST);
    Iterator iter = aggregate.createIterator();
    while (iter.next()) {
      Object item = iter.getCurrentItem();
    }
  }
}
