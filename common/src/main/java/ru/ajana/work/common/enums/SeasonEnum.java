package ru.ajana.work.common.enums;

/**
 * Перечисление сезонов с абстрактным методом.
 *
 * @author Andrey Kharintsev on 24.11.2018
 */
public enum SeasonEnum {
  WINTER {
    public void printHours() {
      System.out.println("9am-3pm");
    }
  }, SPRING {
    public void printHours() {
      System.out.println("9am-5pm");
    }
  }, SUMMER {
    public void printHours() {
      System.out.println("9am-7pm");
    }
  }, FALL {
    public void printHours() {
      System.out.println("9am-5pm");
    }
  };

  public abstract void printHours();
}
