package ru.ajana.work.pattern.behavior.state;

/**
 * Сонкретное состояние 2.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public class ConcreteState2 implements State {

  @Override
  public void handle(Context context) {
    context.setCurrent(new ConcreteState1());
  }
}
