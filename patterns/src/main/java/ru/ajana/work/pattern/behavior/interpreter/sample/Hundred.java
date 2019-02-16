package ru.ajana.work.pattern.behavior.interpreter.sample;

/**
 * @author Andrey Kharintsev on 16.02.2019
 */
public class Hundred extends RNInterpreter {

  public Hundred(int total) {
    super(total);
  }

  @Override
  protected char one() {
    return 'C';
  }

  @Override
  protected String four() {
    return "CD";
  }

  @Override
  protected char five() {
    return 'D';
  }

  @Override
  protected String nine() {
    return "CM";
  }

  @Override
  protected int multiplier() {
    return 100;
  }
}
