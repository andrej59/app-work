// patterns/trashvisitor/Visitable.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// An interface to add visitor functionality to the
// Trash hierarchy without modifying the base class
package ru.ajana.work.pattern.behavior.visitor.sample2;

public interface Visitable {
  // The new method:
  void accept(Visitor v);
}
