package ru.ajana.work.pattern.behavior.observer.sample;

/**
 * Наблюдатель.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public class ObServer {

  private int state = 0;

  public int update(Subject subject) {
    this.state = subject.getState();
    return state;
  }
}
