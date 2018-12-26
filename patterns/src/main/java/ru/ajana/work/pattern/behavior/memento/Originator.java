package ru.ajana.work.pattern.behavior.memento;

/**
 * Создатель.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class Originator {

  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public Memento saveState() {
    return new Memento(state);
  }

  public void restoreState(Memento memento) {
    this.state = memento.getState();
  }
}
