package ru.ajana.work.pattern.generate.factorymethod.sample1;

/**
 * Гранулы.
 *
 * @author Andrey Kharintsev on 24.03.2019
 */
public class Pellets extends Food {

  /**
   * Доступ по умолчанию
   */
  Pellets(int quantity) {
    super(quantity);
  }

  @Override
  public void consumed() {
    System.out.println("Pellets eaten: " + getQuantity());
  }
}
