package ru.ajana.work.pattern.behavior.state.sample;

/**
 * Состояние отключено.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public class OFF extends State {


  @Override
  public void on(Machine machine) {
    System.out.println("Going from  OFF to ON");
    machine.setCurrent(new ON());
  }

  @Override
  public void off(Machine machine) {
  }
}
