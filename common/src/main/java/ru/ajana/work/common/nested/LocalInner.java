package ru.ajana.work.common.nested;

/**
 * Реализация для локльного внутренненого класса.
 *
 * @author Andrey Kharintsev on 08.12.2018
 */
public class LocalInner {

  private int length = 5;

  public void calculate() {
    final int width = 20;
    /**
     * Локальный внутренний класс.
     * - У них нет спецификатора доступа.
     * - Они не могут быть объявлены статическими и не могут объявлять статические поля или методы.
     * - Они имеют доступ ко всем полям и методам класса включения.
     * - Они не имеют доступа к локальным переменным метода, если эти переменные окончательный или окончательным.
     */

    class Inner {

      public void multiply() {
        System.out.println(length * width);
      }
    }
    Inner inner = new Inner();
    inner.multiply();
  }

  public static void main(String[] args) {
    LocalInner outer = new LocalInner();
    outer.calculate();
  }
}

