package ru.ajana.work.common.lambda.sample;

/**
 * @author Andrey Kharintsev on 17.02.2019
 */
public class BlockLamdaDemo {

  interface NumericFunc {

    int func(int n);
  }

  public static void main(String[] args) {
    // Это блочное лямбда - выражениевычисляет
    // факториал целочисленного значения
    NumericFunc factorial = (n) -> {
      int result = 1;
      for (int i = 1; i <= n; i++) {
        result = i * result;
      }
      return result;
    };

    System.out.println("ФaктopиaлчислаЗравен" + factorial.func(3));
    System.out.println("Фaктopиaлчисла5равен" + factorial.func(5));
  }
}
