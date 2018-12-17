package ru.ajana.work.pattern.generate.singleton;

/**
 * Класс экземпляра-одиночки.
 *
 * @author Andrey Kharintsev on 17.12.2018
 */
public class Singleton {

  private static Singleton instance = new Singleton();
  private String data = "Singleton data";

  private Singleton() {
  }

  public static Singleton getInstance() {
    return instance;
  }

  public void operation() {
    System.out.println(data);
  }
}
