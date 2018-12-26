package ru.ajana.work.pattern.behavior.memento;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 26.12.2018
 */
public class AppContext {

  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();

    originator.setState("on");
    System.out.printf("State is %s\n", originator.getState());
    caretaker.setMemento(originator.saveState());

    originator.setState("off");
    System.out.printf("State is %s\n", originator.getState());

    originator.restoreState(caretaker.getMemento());
    System.out.printf("State is %s\n", originator.getState());
  }
  /*
   * Output:
   * State is on
   * State is off
   * State is on
   */
}
