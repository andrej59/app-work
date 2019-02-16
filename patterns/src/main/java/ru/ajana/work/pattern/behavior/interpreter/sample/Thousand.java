package ru.ajana.work.pattern.behavior.interpreter.sample;


/**
 * @author Andrey Kharintsev on 16.02.2019
 */
public class Thousand extends RNInterpreter {

  public Thousand(int total) {
    super(total);
  }

  @Override
  protected char one() {
    return 'M';
  }

  @Override
  protected String four() {
    return "";
  }

  @Override
  protected char five() {
    return '\0';
  }

  @Override
  protected String nine() {
    return "";
  }

  @Override
  protected int multiplier() {
    return 1000;
  }
}
