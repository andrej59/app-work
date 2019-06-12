package ru.ajana.work.common.conversion;

/**
 * @author Andrey Kharintsev on 04.06.2019
 */
public class Context {

  public static void main(String[] args) {
    char ch = 'a';
    long v1 = 1L;
    v1 = ch;

    short v2 = 123;
    ch = (char) v2;

    int i = 10;
    //byte b = 20;
    //b = i;//will not compile because byte is smaller than
    int b = (byte) i; //OK

    final double f = 10.0;//will not compile because 10.0 is a double even though the value 10.0 fits into a
    //float i = f;//will not compile.
  }
}
