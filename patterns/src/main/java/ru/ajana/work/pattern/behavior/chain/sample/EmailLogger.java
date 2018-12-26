package ru.ajana.work.pattern.behavior.chain.sample;

/**
 * Логгер для оправки сообщения на почту.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class EmailLogger extends Logger {

  public EmailLogger(int mask) {
    this.mask = mask;
  }

  protected void writeMessage(String msg) {
    System.out.println("Sending via email: " + msg);
  }

}
