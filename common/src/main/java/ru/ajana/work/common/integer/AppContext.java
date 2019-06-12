package ru.ajana.work.common.integer;

/**
 * @author Andrey Kharintsev on 03.06.2019
 */
public class AppContext {

  public static void main(String[] args) {



    Integer i1 = new Integer(1);
    Integer i2 = new Integer(1);
    int i3 = 1;
    if(i1 == i2){
      System.out.println("Equal - 1");
    }
    if(i1 == i3){
      System.out.println("Equal - 2");
    }
  }
}
