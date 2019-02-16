package ru.ajana.work.pattern.behavior.interpreter;

import java.util.List;

/**
 * Терминальное правило (листовой узел в структуре дерева)
 *
 * @author Andrey Kharintsev on 16.02.2019
 */
public class TerminalExpression implements AbstractExpression {

  /**
   * Ссылается на другие правила.
   */
  private List<AbstractExpression> expressions;

  @Override
  public void interpreter(Context context) {
  }
}
