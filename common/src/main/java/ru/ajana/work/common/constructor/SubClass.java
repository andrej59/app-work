package ru.ajana.work.common.constructor;

/**
 * @author Andrey Kharintsev on 29.06.2019
 */
public class SubClass extends SuperClass {

  int i, j, k;

  public SubClass(int m, int n) {
    //super();
    i = m;
    j = m;
  } //1

  public SubClass(int m) {
    super(m);
  } //2
}
