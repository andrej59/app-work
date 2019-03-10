package ru.ajana.work.pattern.behavior.iterator.sample;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class Client {

  public static void main(String[] args) {
    Stack right = new Stack();
    Stack left = new Stack();
    StackIter itl = left.createIterator();
    StackIter itr = right.createIterator();

    for (itl.first(), itr.first(); !itl.isDone(); itl.next(), itr.next()) {
      if (itl.currentItem() != itr.currentItem()) {
        break;
      }
    }
    boolean ans = itl.isDone() && itr.isDone();
    System.out.println("ans: " + ans);
  }
}
