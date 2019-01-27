package ru.ajana.work.pattern.behavior.state.sample;

/**
 * Абстрактный класс состояния.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public abstract class State {

  public abstract void on(Machine machine);

  public abstract void off(Machine machine);
}
