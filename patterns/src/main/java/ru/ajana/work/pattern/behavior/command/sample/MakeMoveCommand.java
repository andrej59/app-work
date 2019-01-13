package ru.ajana.work.pattern.behavior.command.sample;

/**
 * Команды перемещения игры.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class MakeMoveCommand extends Command {

  public MakeMoveCommand(Game game) {
    super(game);
  }

  @Override
  public void execute() {
    // Сохраним игру для возможного последующего отката
    game.save("TEMP_FILE");
    String fileMove = "file-move.txt";
    game.makeMove(fileMove);
  }
}
