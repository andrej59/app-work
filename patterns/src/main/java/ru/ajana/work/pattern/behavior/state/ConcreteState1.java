package ru.ajana.work.pattern.behavior.state;

/**
 * Конкретное состояние 1.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public class ConcreteState1 implements State {
  @Override
  public void handle(Context context) {
    context.setCurrent(new ConcreteState2());
  }
}
