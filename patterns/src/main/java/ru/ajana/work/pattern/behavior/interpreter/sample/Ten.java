package ru.ajana.work.pattern.behavior.interpreter.sample;

/**
 * @author Andrey Kharintsev on 16.02.2019
 */
public class Ten extends RNInterpreter {

  public Ten(int total) {
    super(total);
  }

  @Override
  protected char one() {
    return 'X';
  }

  @Override
  protected String four() {
    return "XL";
  }

  @Override
  protected char five() {
    return 'L';
  }

  @Override
  protected String nine() {
    return "XC";
  }

  @Override
  protected int multiplier() {
    return 10;
  }
}
