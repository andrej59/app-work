package ru.ajana.work.pattern.behavior.chain;

/**
 * Конкретный обработчик 2
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class ConcretHandler2 implements Handler {

  @Override
  public void handleRequest(String message) {
    System.out.println("ConcretHandler2: " + message);
  }
}
