package ru.ajana.work.pattern.behavior.iterator.sample;

/**
 * Стрктура данных стек.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class Stack {

  private int[] items = new int[]{1, 2, 3, 4, 5};
  private int sp;

  public Stack() {
    this.sp = -1;
  }

  public void push(int in) {
    items[++sp] = in;
  }

  public int pop() {
    return items[sp--];
  }

  public boolean isEmpty() {
    return (sp == -1);
  }

  public int[] getItems() {
    return items;
  }

  public void setItems(int[] items) {
    this.items = items;
  }

  public int getSp() {
    return sp;
  }

  public void setSp(int sp) {
    this.sp = sp;
  }

  public StackIter createIterator() {
    return new StackIter(this);
  }
}
