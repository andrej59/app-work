package ru.ajana.work.nested;

/**
 * Внешний класс для внутренненого.
 *
 * @author Andrey Kharintsev on 08.12.2018
 */
public class OuterInner {

  private String greeting = "Hi";

  /**
   * Внутренний класс (нестатический)
   */
  protected class Inner {

    public int repeat = 3;

    public void go() {
      for (int i = 0; i < repeat; i++) {
        System.out.println(greeting);
      }
    }
  }

  public void callInner() {
    Inner inner = new Inner();
    inner.go();
  }

  public static void main(String[] args) {
    OuterInner outer = new OuterInner();
    outer.callInner();
  }
}
