package ru.ajana.work.nested;

/**
 * Реализация вложенного статического класса.
 * <b>
 * - Вложенность создает пространство имен, поскольку имя заключающего класса должно использоваться
 * для ссылки к ней. - Его можно сделать private или использовать другие модификаторы доступа
 * инкапсуляции
 *
 * @author Andrey Kharintsev on 09.12.2018
 */
public class StaticNested {

  // Вложенный статический класс
  static class Nested {
    private int price = 6;
  }

  public static void main(String[] args) {
    Nested nested = new Nested();
    System.out.println(nested.price);
  }
}
