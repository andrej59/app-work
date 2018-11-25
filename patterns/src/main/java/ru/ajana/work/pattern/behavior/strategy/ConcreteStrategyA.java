package ru.ajana.work.pattern.behavior.strategy;

public class ConcreteStrategyA implements Strategy {

  @Override
  public String execute(String input) {
    return "execute ConcreteStrategyA - " + input;
  }
}
