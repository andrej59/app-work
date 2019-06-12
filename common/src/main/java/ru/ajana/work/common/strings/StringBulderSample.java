package ru.ajana.work.common.strings;

/**
 * @author Andrey Kharintsev on 05.06.2019
 */
public class StringBulderSample {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    String str = sb.append("abcd").insert(2, "asdf").substring(0, 4);
    System.out.println(str);


  }
}
