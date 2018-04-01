package ru.ajana.work.oop;

/**
 * Класс потомка.
 *
 * @author Andrey Kharintsev on 16.03.2018
 */
public class ChildClazz extends ParentClazz {

  public ChildClazz(){
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        System.out.println("Shutdown ChildClazz");
      }
    });
  }
  @Override
  public void display() {
    super.display();
  }
}
