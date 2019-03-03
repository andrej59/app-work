package ru.ajana.work.common.lambda.sample;

/**
 * @author Andrey Kharintsev on 17.02.2019
 */
public class Sample3 {

  interface NшnericTest2 {

    boolean test(int n, int d);
  }

  public static void main(String[] args) {
    NшnericTest2 isFactor = (n, d) -> (n % d) == 0;
    if (isFactor.test(10, 2)) {
      System.out.println("Чиcлo 2 является множителем числа 10");
    }
    if (!isFactor.test(10, 3)) {
      System.out.println("Чиcлo З не является множителем числа 10");
    }
  }
}
