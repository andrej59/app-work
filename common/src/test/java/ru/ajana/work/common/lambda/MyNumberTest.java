package ru.ajana.work.common.lambda;


import org.junit.Test;

/**
 * @author Andrey Kharintsev
 * @date 03.03.2018.
 */
public class MyNumberTest {

  @Test
  public void test() {

    MyNumber myNun;
    myNun = () -> 1.23;
    System.out.println(myNun.getValue());
  }
}
