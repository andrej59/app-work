package ru.ajana.work.pattern.behavior.iterator;

import java.util.List;

/**
 * Конкретный аргрегатор.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class ConcreteAggregate implements Aggregate {

  private List<Object> items;

  public ConcreteAggregate(List<Object> items) {
    this.items = items;
  }

  @Override
  public List<Object> getItems() {
    return items;
  }

  @Override
  public Iterator createIterator() {
    return new ConcreteIterator(this);
  }
}
