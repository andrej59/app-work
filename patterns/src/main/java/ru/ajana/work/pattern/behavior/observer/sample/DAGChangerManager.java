package ru.ajana.work.pattern.behavior.observer.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * Менеджер сначало помечает, затем удаляет.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public class DAGChangerManager implements ChangeManager {

  private Map<Subject, ObServer> subjectObServerMap = new HashMap<>();

  @Override
  public void register(Subject subject, ObServer obServer) {
    subjectObServerMap.put(subject, obServer);
  }

  @Override
  public void unregister(Subject subject, ObServer obServer) {
    subjectObServerMap.remove(subject);
  }

  @Override
  public void sendNotify() {
    subjectObServerMap.keySet().forEach(s -> s.setState(1));
    subjectObServerMap.forEach((k, v) -> {
      if (k.getState() == 1) {
        v.update(k);
        subjectObServerMap.remove(k);
      }
    });
  }
}
