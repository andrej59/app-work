package ru.ajana.work.pattern.behavior.chain;

/**
 * Клиент.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class Client {


  public void execute() {
    ConcretHandler1 handler1 = new ConcretHandler1();
    ConcretHandler2 handler2 = new ConcretHandler2();
    handler1.message("Request", handler2);
  }
}
