package ru.ajana.work.pattern.behavior.command.sample;

/**
 * @author Andrey Kharintsev on 13.01.2019
 */
public class UndoCommand extends Command {

  public UndoCommand(Game game) {
    super(game);
  }

  @Override
  public void execute() {
    // Состанавливает игру из временного файла.
    game.open("TEMP_FILE");
  }
}
