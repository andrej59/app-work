package ru.ajana.work.pattern.generate.factorymethod;

import java.util.List;

/**
 * Абстрактный класс создателя продукта.
 *
 * @author Andrey Kharintsev on 24.11.2018
 */
public abstract class Creator {

  private List<Product> products;

  public abstract Product factoryMethod();

  public void onOperation() {
    // Создание продукта делегируем объекту класса
    Product product = factoryMethod();
    products.add(product);
  }
}
