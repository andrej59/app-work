package ru.ajana.work.common.prof;

/**
 * Тест для профилирования.
 *
 * @author Andrey Kharintsev on 09.03.2018
 */
public class StringBuilderTest {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("0");
    for (int i = 0; i < 1000000; i++) {
      sb.delete(0, 1);
      sb.append(i);
    }
    System.out.println(sb.length());
  }
}
