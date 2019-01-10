package ru.ajana.work.pattern.behavior.observer.sample;

/**
 * Субъект
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public class Subject {

  private ChangeManager changeManager;
  private int state;

  public Subject(ChangeManager changeManager) {
    this.changeManager = changeManager;
  }

  public void setState(int state) {
    this.state = state;
    changeManager.sendNotify();
  }

  public int getState() {
    return state;
  }

  public void attach(ObServer obServer) {
    changeManager.register(this, obServer);
  }

  public void detach(ObServer obServer) {
    changeManager.unregister(this, obServer);
  }

  public void sendNotify() {
    changeManager.sendNotify();
  }
}
