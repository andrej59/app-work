package ru.ajana.work.pattern.behavior.chain;

/**
 * Конкретный обработчик 1.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class ConcretHandler1 implements Handler {

  @Override
  public void handleRequest(String message) {
    System.out.println("ConcretHandler1: " + message);
  }
}
