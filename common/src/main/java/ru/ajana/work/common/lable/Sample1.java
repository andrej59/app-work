package ru.ajana.work.common.lable;

public class Sample1 {

  public static void main(String[] args) {
    long a = (int) 123;
    byte b = (byte) 321;
    System.out.println(b+256);
    outer:
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 3; k++) {
          if (j == k) {
            continue outer;
          }
          System.out.println("i=" + i + " , j=" + j);
        }
      }
    }
  }
}
