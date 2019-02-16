package ru.ajana.work.pattern.behavior.interpreter.sample;

/**
 * http://cpp-reference.ru/patterns/behavioral-patterns/interpreter/
 * <b>
 * Интерпретатор значений строковых представлений римских чисел. Используем следующую грамматику.
 *
 * romanNumeral ::= {thousands} {hundreds} {tens} {ones}
 * <b>
 * thousands,hundreds,tens,ones ::= nine | four | {five} {one} {one} {one}
 * <b>
 * nine ::= "CM" | "XC" | "IX"
 * <b>
 * four ::= "CD" | "XL" | "IV"
 * <b>
 * five ::= 'D' | 'L' | 'V'
 * <b>
 * one  ::= 'M' | 'C' | 'X' | 'I'
 *
 * @author Andrey Kharintsev on 16.02.2019
 */
public class RNInterpreter {

  private int total;
  private RNInterpreter thousands;
  private RNInterpreter hundreds;
  private RNInterpreter tens;
  private RNInterpreter ones;

  public RNInterpreter() {
    this.thousands = new Thousand(1);
    this.hundreds = new Hundred(1);
    this.tens = new Ten(1);
    this.ones = new One(1);
  }

  public RNInterpreter(int total) {
    this.total = total;
  }

  public int interpret(String input) {
    total = 0;
    thousands.interpretTotal(input);
    hundreds.interpretTotal(input);
    tens.interpretTotal(input);
    ones.interpretTotal(input);
    if (input.equals("")) {
      // if input was invalid, return 0
      return 0;
    }
    return total;
  }

  void interpretTotal(String input) {
    // for internal use
    int index;
    index = 0;
    if (!strncmp(input, nine(), 2)) {
      total += 9 * multiplier();
      index += 2;
    } else if (!strncmp(input, four(), 2)) {
      total += 4 * multiplier();
      index += 2;
    } else {
      if (input.charAt(0) == five()) {
        total += 5 * multiplier();
        index = 1;
      } else {
        index = 0;
      }
      for (int end = index + 3; index < end; index++) {
        if (input.charAt(index) == one()) {
          total += 1 * multiplier();
        } else {
          break;
        }
      }
    }
    input = input.concat(String.valueOf(input.charAt(index)));
  }

  private boolean strncmp(String input, String ch, int len) {
    return input.substring(0, len).equals(ch);
  }

  protected char one() {
    return 0;
  }


  protected String four() {
    return "";
  }

  protected char five() {
    return 0;
  }
  protected String nine() {
    return "";
  }

  protected int multiplier() {
    return 0;
  }
}
