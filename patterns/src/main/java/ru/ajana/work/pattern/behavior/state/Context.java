package ru.ajana.work.pattern.behavior.state;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public class Context {

  private State current; // хранит внутренне состояние

  public Context() {
    this.current = new ConcreteState1();
  }

  public void setCurrent(State current) {
    this.current = current;
  }

  public void request() {
    current.handle(this);
  }
}
