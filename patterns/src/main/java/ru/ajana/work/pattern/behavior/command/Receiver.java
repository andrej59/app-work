package ru.ajana.work.pattern.behavior.command;

/**
 * Класс получателя команды (получатель знает как необходимо выполнить команду).
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class Receiver {

  public void action() {
    System.out.println("Execute action");
  }
}
