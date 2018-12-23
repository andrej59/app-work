package ru.ajana.work.pattern.struct.decorator;

/**
 * Конкретный декоратор B.
 *
 * @author Andrey Kharintsev on 20.11.2018
 */
public class ConcreteDecoratorB extends Decorator {

  public ConcreteDecoratorB(AppComponent component) {
    super(component);
  }

  @Override
  public void operation() {
    super.operation();
  }

  public void addedBehavior(Decorator decorator) {
  }
}
