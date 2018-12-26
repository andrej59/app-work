package ru.ajana.work.pattern.behavior.chain;

/**
 * Интерфейс обработчика.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public interface Handler {

  /**
   * Делегирует обработку сообщения следующему обработчику.
   */
  default void message(String message, Handler nextNandler) {
    if (message != null) {
      handleRequest(message);

    }
    // Делегирует обработку сообщения следующему обработчику.
    if (nextNandler != null) {
      nextNandler.handleRequest(message);
    }
  }

  void handleRequest(String message);
}
