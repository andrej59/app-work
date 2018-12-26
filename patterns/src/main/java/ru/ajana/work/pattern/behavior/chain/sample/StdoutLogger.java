package ru.ajana.work.pattern.behavior.chain.sample;

/**
 * Логгер для записи сообщений в стандарный поток.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class StdoutLogger extends Logger {

  public StdoutLogger(int mask) {
    this.mask = mask;
  }

  protected void writeMessage(String msg) {
    System.out.println("Writing to stdout: " + msg);
  }
}
