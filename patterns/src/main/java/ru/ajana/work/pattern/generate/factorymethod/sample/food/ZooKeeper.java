package ru.ajana.work.pattern.generate.factorymethod.sample.food;

/**
 * Посетитель зоопартка.
 *
 * @author Andrey Kharintsev on 24.03.2019
 */
public class ZooKeeper {

  public static void main(String[] args) {
    final Food food = FoodFactory.getFood("polar bear");
    food.consumed();
  }
}
