package ru.ajana.work.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретный субъект.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public class ConcreteSubject implements Subject {

  private int subjectState = 0; // наблюдаем статус объекта
  private List<ObServer> obServerList = new ArrayList<>();

  @Override
  public void attach(ObServer obServer) {
    obServerList.add(obServer);
  }

  @Override
  public void detach(ObServer obServer) {
    obServerList.remove(obServer);
  }

  @Override
  public void sendNotify() {
    // Отправляем оповещение всем подпищикам
    for (ObServer o : obServerList) {
      o.update(this);
    }
  }

  public void setSubjectState(int subjectState) {
    this.subjectState = subjectState;
    sendNotify();
  }

  public int getSubjectState() {
    return subjectState;
  }
}
