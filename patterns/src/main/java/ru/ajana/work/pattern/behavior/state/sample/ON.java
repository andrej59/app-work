package ru.ajana.work.pattern.behavior.state.sample;

/**
 * Состояние отключено.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public class ON extends State {

  @Override
  public void on(Machine machine) {
  }

  @Override
  public void off(Machine machine) {
    System.out.println("Going from  ON to OFF");
    machine.setCurrent(new OFF());
  }
}
