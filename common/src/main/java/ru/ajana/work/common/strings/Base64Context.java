package ru.ajana.work.common.strings;


import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @author Andrey Kharintsev on 20.11.2018
 */
public class Base64Context {

  public static void main(String[] args) {
    String input = "123465";
    System.out.println("Java base64: " + Base64.getEncoder()
        .encodeToString(new String(input.getBytes(), Charset.forName("UTF-8")).getBytes()));
  }
}
