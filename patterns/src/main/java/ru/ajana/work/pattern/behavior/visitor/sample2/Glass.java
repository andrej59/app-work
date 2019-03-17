// patterns/trashvisitor/Glass.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Glass for the visitor pattern
package ru.ajana.work.pattern.behavior.visitor.sample2;
public class Glass extends ru.ajana.work.pattern.behavior.visitor.sample2.trash.Glass
    implements Visitable {
  public Glass(double wt) { super(wt); }
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
