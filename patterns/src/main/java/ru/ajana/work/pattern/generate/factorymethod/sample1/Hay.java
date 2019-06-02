package ru.ajana.work.pattern.generate.factorymethod.sample1;

/**
 * Сено.
 *
 * @author Andrey Kharintsev on 24.03.2019
 */
public class Hay extends Food {

  /**
   * Доступ по умолчанию
   */
  Hay(int quantity) {
    super(quantity);
  }

  @Override
  public void consumed() {
    System.out.println("Hay eaten: " + getQuantity());
  }
}
