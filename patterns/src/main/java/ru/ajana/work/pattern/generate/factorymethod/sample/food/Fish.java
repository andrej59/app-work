package ru.ajana.work.pattern.generate.factorymethod.sample.food;

/**
 * @author Andrey Kharintsev on 24.03.2019
 */
public class Fish extends Food {

  /**
   * Доступ по умолчанию
   * @param quantity
   */
  Fish(int quantity) {
    super(quantity);
  }

  @Override
  public void consumed() {
    System.out.println("Fish eaten: " + getQuantity());
  }
}
