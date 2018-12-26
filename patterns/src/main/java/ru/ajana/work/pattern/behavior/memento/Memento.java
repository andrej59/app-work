package ru.ajana.work.pattern.behavior.memento;

/**
 * Хранитель.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class Memento {

  private final String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
