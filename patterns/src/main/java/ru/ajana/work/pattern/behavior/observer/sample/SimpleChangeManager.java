package ru.ajana.work.pattern.behavior.observer.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * Простой менеджер изменений.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public class SimpleChangeManager implements ChangeManager {

  private Map<Subject, ObServer> subjectObServerMap = new HashMap<>();


  public void register(Subject subject, ObServer obServer) {
    subjectObServerMap.put(subject, obServer);
  }

  public void unregister(Subject subject, ObServer obServer) {
    subjectObServerMap.remove(subject);
  }

  public void sendNotify() {
    subjectObServerMap.forEach((k, v) -> v.update(k));
  }
}
