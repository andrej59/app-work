package ru.ajana.work.pattern.behavior.command.sample;

/**
 * Команда создания игры.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class CreateGameCommand extends Command {

  public CreateGameCommand(Game game) {
    super(game);
  }

  @Override
  public void execute() {
    game.create();
  }
}
