package ru.ajana.work.pattern.behavior.command;

import java.util.List;

/**
 * Класс вызывающего объекта (инициатор запроса).
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class Invoker {

  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void invoke() {
    command.execute();
  }
}
