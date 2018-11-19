package ru.ajana.work.pattern.behavior.strategy;

/**
 * Кастомная стратегия.
 */
public class CustomStrategy implements Strategy {

  @Override
  public String execute(String input) {
    return "execute CustomStrategy - " + input;
  }
}
