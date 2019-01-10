package ru.ajana.work.pattern.behavior.observer.sample;

/**
 * Менеджер изменений.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public interface ChangeManager {

  void register(Subject subject, ObServer obServer);

  void unregister(Subject subject, ObServer obServer);

  void sendNotify();
}
