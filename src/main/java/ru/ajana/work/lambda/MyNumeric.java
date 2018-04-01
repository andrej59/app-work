package ru.ajana.work.lambda;

/**
 * @author Andrey Kharintsev
 * @date 03.03.2018.
 */
@FunctionalInterface
public interface MyNumeric {

  boolean test(int n);

  default int func(int i) {
    return i + 1;
  }
}
