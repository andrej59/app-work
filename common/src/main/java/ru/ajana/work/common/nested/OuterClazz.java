package ru.ajana.work.common.nested;

import java.util.concurrent.Callable;

/**
 * Внешний класс-обертка.
 *
 * @author Andrey Kharintsev on 15.03.2018
 */

public class OuterClazz {

  private String outerValue = "outerValue";
  private static String staticOuterValue = "staticOuterValue";

  public static void staticDisplay() {
    class LocalInnerClazz {
      void msg() {
        System.out.println("LocalInnerClazz");
      }
    }
    LocalInnerClazz localInner = new LocalInnerClazz();
    localInner.msg();
  }

  public void display() {
    // Локальный внутренний класс
    class LocalInnerClazz {

      void msg() {
        System.out.println("LocalInnerClazz");
        System.out.println("outerValue: " + OuterClazz.this.outerValue);
        OuterClazz.this.display();
      }
    }
    LocalInnerClazz localInner = new LocalInnerClazz();
    localInner.msg();

    // Аннонимный класс (локальный без имени)
    Callable<String> call = new Callable() {
      public String call() throws Exception {
        return "Аннонимный класс";
      }
    };
    try {
      call.call();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Статический внутренний класс
  static class StaticNestedClazz {

    void msg() {
      System.out.println("StaticNestedClazz");
    }
  }

  // Внутренний класс-член
  class MemberInnerClazz {

    void msg() {
      System.out.println("MemberInnerClazz");
      System.out.println("outerValue: " + OuterClazz.this.outerValue);
      OuterClazz.this.display();
    }
  }
}
