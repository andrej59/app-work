package ru.ajana.work.pattern.behavior.interpreter.sample;

/**
 * @author Andrey Kharintsev on 16.02.2019
 */
public class One extends RNInterpreter {

  public One(int total) {
    super(total);
  }

  @Override
  protected char one() {
    return 'I';
  }

  @Override
  protected String four() {
    return "IV";
  }

  @Override
  protected char five() {
    return 'V';
  }

  @Override
  protected String nine() {
    return "IX";
  }

  @Override
  protected int multiplier() {
    return 1;
  }
}
