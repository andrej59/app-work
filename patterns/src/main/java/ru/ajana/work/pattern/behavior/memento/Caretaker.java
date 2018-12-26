package ru.ajana.work.pattern.behavior.memento;

/**
 * Опекун.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class Caretaker {

  private Memento memento;

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}
