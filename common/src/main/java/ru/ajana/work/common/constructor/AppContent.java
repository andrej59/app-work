package ru.ajana.work.common.constructor;

/**
 * @author Andrey Kharintsev on 29.06.2019
 */
public class AppContent {

  public static void main(String[] args) {
    //SubClass subClass = new SubClass(); // invalid
    SubClass subClass = new SubClass(1);
  }
}
