package ru.ajana.work.pattern.behavior.chain.sample;

/**
 * Логгер для записи сообщения об ошибке.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class StderrLogger extends Logger {

  public StderrLogger(int mask) {
    this.mask = mask;
  }

  protected void writeMessage(String msg) {
    System.out.println("Sending to stderr: " + msg);
  }
}
