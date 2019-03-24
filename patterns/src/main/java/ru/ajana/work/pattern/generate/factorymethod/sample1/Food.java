package ru.ajana.work.pattern.generate.factorymethod.sample.food;

/**
 * Абстрактный класс еда.
 *
 * @author Andrey Kharintsev on 24.03.2019
 */
public abstract class Food {

  private int quantity;

  public Food(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public abstract void consumed();
}
