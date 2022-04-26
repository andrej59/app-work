package ru.ajana.work.pattern.behavior.state.sample;

/**
 * Машина автомат.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public class Machine {

  private State current;

  public Machine() {
    this.current = new OFF();
  }

  public void setCurrent(State current) {
    this.current = current;
  }

  public void on() {
    current.on(this);
  }

  public void off() {
    current.off(this);
  }
}
