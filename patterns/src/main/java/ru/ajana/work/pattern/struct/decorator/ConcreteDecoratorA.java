package ru.ajana.work.pattern.struct.decorator;

/**
 * Конкретный декоратор A.
 *
 * @author Andrey Kharintsev on 20.11.2018
 */
public class ConcreteDecoratorA extends Decorator {

  public ConcreteDecoratorA(AppComponent component) {
    super(component);
  }

  private void addState() {
  }

  @Override
  public void operation() {
    super.operation();
    addState();
  }
}
