package ru.ajana.work.pattern.behavior.observer;

/**
 * Интерфейс суобъекта.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public interface Subject {

  void attach(ObServer obServer);

  void detach(ObServer obServer);

  void sendNotify();
}
