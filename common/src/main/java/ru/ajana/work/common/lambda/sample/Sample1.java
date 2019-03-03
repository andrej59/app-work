package ru.ajana.work.common.lambda.sample;

/**
 * @author Andrey Kharintsev on 16.02.2019
 */
public class Sample1 {


  public static void main(String[] args) {
    MyNumber myNumber = () -> 1.123;
    System.out.println(myNumber.getValue());
  }

}
