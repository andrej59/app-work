package ru.ajana.work.pattern.behavior.command;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class Client {

  public static void main(String[] args) {
    Receiver receiver = new Receiver(); // Получатель
    Command command = new ContreteCommand(receiver); // Коммента

    Invoker invoker = new Invoker(command);
    invoker.invoke();
  }
}
