package ru.ajana.work.common.gc;

/**
 * @author Andrey Kharintsev on 12.06.2019
 */
public class Context {

  private Object o;

  void doSomething(Object s) {
    o = s;
  }

  public static void main(String[] args) {
    Object obj = new Object(); // 1
    Context tc = new Context(); //2
    tc.doSomething(obj); //3
    obj = new Object();    //4
    obj = null;    //5
    tc.doSomething(obj); //6
  }
}
