package ru.ajana.work.pattern.behavior.command.sample;

/**
 * Базовый класс.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public abstract class Command {

  protected Game game;

  protected Command(Game game) {
    this.game = game;
  }

  public abstract void execute();

}
