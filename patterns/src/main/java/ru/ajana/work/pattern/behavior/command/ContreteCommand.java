package ru.ajana.work.pattern.behavior.command;

/**
 * Конкретный класс команды.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class ContreteCommand extends Command {

  private int state;
  private Receiver receiver;

  public ContreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action();
  }
}
