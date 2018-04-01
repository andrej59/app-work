package ru.ajana.work.lambda;

import org.junit.Test;

/**
 * @author Andrey Kharintsev on 03.03.2018
 */
public class MyNurnerTest {

  @Test
  public void test() {
    MyNumeric myNumeric;

    myNumeric = (n) -> n % 2 == 0;

    System.out.println(myNumeric.test(2));

  }
}
