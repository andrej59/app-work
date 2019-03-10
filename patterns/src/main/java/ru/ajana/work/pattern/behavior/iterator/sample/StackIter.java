package ru.ajana.work.pattern.behavior.iterator.sample;

/**
 * Класс итератор для стека.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class StackIter {

  private Stack stack;
  private int index;

  public StackIter(Stack stack) {
    this.stack = stack;
  }

  public void first() {
    index = 0;
  }

  public void next() {
    index++;
  }

  public boolean isDone() {
    return index == stack.getSp() + 1;
  }

  public int currentItem() {
    return stack.getItems()[index];
  }
}
