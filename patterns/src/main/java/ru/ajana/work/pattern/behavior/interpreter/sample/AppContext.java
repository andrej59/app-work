package ru.ajana.work.pattern.behavior.interpreter.sample;

/**
 * @author Andrey Kharintsev on 16.02.2019
 */
public class AppContext {


  public static void main(String[] args) {
    System.out.println("Enter Roman Numeral: ");
    String input = "MCMXCVI";

    System.out.println("   interpretation is ");
    System.out.println(new RNInterpreter().interpret(input));
    System.out.println("Enter Roman Numeral: ");
  }
}
