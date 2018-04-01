package ru.ajana.work.lambda;

/**
 * @author Andrey Kharintsev on 04.03.2018
 */
public class MyClazz {

  private int value;

  public MyClazz(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public class MyNeedClazz {
    private int getTest() {
      return 1;
    }
  }
}
