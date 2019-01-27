package ru.ajana.work.pattern.behavior.state;

/**
 * Интерфейс состояния.
 *
 * @author Andrey Kharintsev on 27.01.2019
 */
public interface State {

  void handle(Context context);
}
