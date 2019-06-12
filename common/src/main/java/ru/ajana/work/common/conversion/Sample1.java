package ru.ajana.work.common.conversion;

/**
 * @author Andrey Kharintsev on 05.06.2019
 */
public class Sample1 {

  public static void main(String[] args) {
    //Actually it prints -46. This is because the information was lost during the conversion from type
    // int to type float as values of type float are not precise to nine significant digits.
    // Note: You are not required to know the number of significant digits that can be stored by a f
    // loat for the exam. However, it is good to know about loss of precision while using float and double.
    int i = 1234567890;
    float f = i;
    System.out.println(f);
    System.out.println(i - (int) f);
  }
}
