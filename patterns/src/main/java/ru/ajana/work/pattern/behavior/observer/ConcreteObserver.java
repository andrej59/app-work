package ru.ajana.work.pattern.behavior.observer;

/**
 * Конкретный наблюдатель.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public class ConcreteObserver implements ObServer {

  private int observerState = 0;

  @Override
  public void update(Subject subject) {
    this.observerState = ((ConcreteSubject) subject).getSubjectState();
    System.out.println("State: "+ this.observerState);
  }
}
