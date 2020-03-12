package ru.ajana.work.pattern.struct.decorator;

/**
 * Абстрактный декоратор.
 *
 * @author Andrey Kharintsev on 20.11.2018
 */
public abstract class Decorator implements AppComponent {

  private final AppComponent component;

  public Decorator(AppComponent component) {
    this.component = component;
  }

  @Override
  public void operation() {
    component.operation();
  }
}
