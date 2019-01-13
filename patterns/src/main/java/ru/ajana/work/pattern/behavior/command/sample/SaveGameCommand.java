package ru.ajana.work.pattern.behavior.command.sample;

/**
 * Команда сохранения игры.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class SaveGameCommand extends Command {

  public SaveGameCommand(Game game) {
    super(game);
  }

  @Override
  public void execute() {
    String fileName = "file-save.txt";
    game.open(fileName);
  }
}
