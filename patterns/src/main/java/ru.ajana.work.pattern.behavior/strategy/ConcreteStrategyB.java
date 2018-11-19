package ru.ajana.work.pattern.behavior.strategy;

public class ConcreteStrategyB implements Strategy {

  @Override
  public String execute(String input) {
     return  "execute ConcreteStrategyB - " + input;
  }
}
