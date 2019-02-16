package ru.ajana.work.pattern.behavior.interpreter;

/**
 * Интерфейс абстрактного правила.
 *
 * @author Andrey Kharintsev on 16.02.2019
 */
public interface AbstractExpression {

  void interpreter(Context context);
}
