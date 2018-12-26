package ru.ajana.work.common.strings;

import org.junit.Test;

/**
 * @author Andrey Kharintsev on 29.03.2018
 */
public class StringTest {

  @Test
  public void testEquels() {
    String val1 = "значение";
    String val2 = "значение";
    String val3 = new String("значение");

    if (val1 == val2) {
      System.out.println("Кот");
    }

    if (val1 == val3) {
      System.out.println("Собака");
    }

    if (val1.equals(val2)) {
      System.out.println("Лошадь");
    }

    if (val1.equals(val3)) {
      System.out.println("Корова");
    }

  }

  @Test
  public void testHorse() {
    StringBuilder horse1 = new StringBuilder("Лошадь");
    StringBuilder horse2 = new StringBuilder("Лошадь");
    if (horse1.equals(horse2)) {
      System.out.println("Лошадь");
    }else{
      System.out.println("Лошадь стала коровой");
    }
  }
}
