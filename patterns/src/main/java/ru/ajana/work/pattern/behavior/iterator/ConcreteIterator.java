package ru.ajana.work.pattern.behavior.iterator;

/**
 * Конкретный итератор.
 *
 * @author Andrey Kharintsev on 09.03.2019
 */
public class ConcreteIterator implements Iterator {

  private Aggregate aggregate;
  private int index;

  public ConcreteIterator(Aggregate aggregate) {
    this.aggregate = aggregate;
  }

  @Override
  public boolean next() {
    index++;
    if (index < aggregate.getItems().size()) {
      return true;
    } else {
      return false;
    }
  }

  public Object getCurrentItem() {
    return aggregate.getItems().get(index);
  }
}
