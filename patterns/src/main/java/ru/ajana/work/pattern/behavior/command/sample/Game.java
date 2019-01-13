package ru.ajana.work.pattern.behavior.command.sample;

/**
 * Игра в шахматы.
 *
 * @author Andrey Kharintsev on 13.01.2019
 */
public class Game {

  public void create() {
    System.out.println("Create game");
  }

  public void open(String file) {
    System.out.println("Open game from " + file);
  }

  public void save(String file) {
    System.out.println("Save game in " + file);
  }

  public void makeMove(String move) {
    System.out.println("Make move in " + move);
  }
}
