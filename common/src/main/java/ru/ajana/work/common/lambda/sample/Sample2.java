package ru.ajana.work.common.lambda.sample;

/**
 * @author Andrey Kharintsev on 17.02.2019
 */
public class Sample2 {

  public interface NumericTest {
    boolean test(int n);
  }

  public static void main(String[] args) {
    NumericTest isEven = (n) -> (n % 2) == 0;

    if (isEven.test(10)) {
      System.out.println("Чиcлo 10 четное");
    }
    if (!isEven.test(9)) {
      System.out.println("Чиcлo 9 нечетное");
    }
    NumericTest isNonNeg = (n) -> n >= 0;
    if (isNonNeg.test(1)) {
      System.out.println("Чиcлo1 не отрицательное");
    }
    if (!isNonNeg.test(-1)) {
      System.out.println("Чиcлo -1 отрицательное");
    }
  }
}
