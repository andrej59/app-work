package ru.ajana.work.nested;

/**
 * Анонимный внутренний класс.
 *
 * @author Andrey Kharintsev on 09.12.2018
 */
public class AnonInner {

  interface SaleTodayOnly {
    int dollarsOff();
  }

  abstract class AbstarctSaleTodayOnly {
    abstract int dollarsOff();
  }

  public int admission(int basePrice) {
    {
      // Анонимный внутренний класс
      SaleTodayOnly sale = new SaleTodayOnly() {
        public int dollarsOff() {
          return 1;
        }
      };
    }
    {
      // Анонимный внутренний класс
      AbstarctSaleTodayOnly sale = new AbstarctSaleTodayOnly() {
        int dollarsOff() {
          return 3;
        }
      };
      return basePrice - sale.dollarsOff();
    }
  }
  // Перегруженый метод admission
  public int admission(int basePrice, SaleTodayOnly sale){
    return basePrice - sale.dollarsOff();
  }

  public int pay() {
    return admission(5, new SaleTodayOnly() {
      public int dollarsOff() {
        return 3;
      }
    });
  }
}
