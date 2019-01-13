package ru.ajana.work.pattern.behavior.command.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class AppContext {

  public static void main(String[] args) {
    Game game = new Game();
    // Имитация действий игрока
    List<Command> commands = new ArrayList<>();
    // Создаем новую игру
    commands.add(new CreateGameCommand(game));
    // Делаем несколько ходов
    commands.add(new MakeMoveCommand(game));
    commands.add(new MakeMoveCommand(game));
    // Последний ход отменяем
    commands.add(new UndoCommand(game));
    // Сохраняем игру
    commands.add(new SaveGameCommand(game));

    commands.forEach(c -> c.execute());
    commands.clear();
  }
}
