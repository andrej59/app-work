package ru.ajana.work.pattern.behavior.observer;

/**
 * Интерфейс наблюдателя.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public interface ObServer {

  void update(Subject subject);
}
