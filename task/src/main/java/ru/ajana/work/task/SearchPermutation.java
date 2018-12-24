package ru.ajana.work.task;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Дан текст T и строка S. Требуется найти подстроку S' в T такую, что она совпадает с S с точностью
 * до перестановки букв.
 *
 * для примера. s='aabbcc', t='ba' - будет True, так как ab есть в строке
 *
 * @author Andrey Kharintsev on 23.12.2018
 */
public class SearchPermutation {

  /**
   * Входящий текст.
   */
  private final static String INTPUT = "zxcqwe abc acb cba cab";
  /**
   * Подстрока для поиска всех перестановок.
   */
  private final static String SUBSTR = "cba";

  public static void main(String[] args) {
    List<String> perList = search(INTPUT, SUBSTR);
    perList.forEach(str -> {
      out.println(str);
    });
  }

  /**
   * Выполняет поиск всех перестановок.
   *
   * @param input входящая строка текста
   * @param substr подстрока для поиска
   * @return список найденных перестановок
   */
  public static List<String> search(String input, String substr) {
    List<String> list = new LinkedList<>();
    if (input == null || substr == null) {
      return Collections.EMPTY_LIST;
    }
    if (substr.length() > input.length()) {
      return Collections.EMPTY_LIST;
    }
    if (input.equals(substr)) {
      list.add(input);
      return list;
    }
    // Вычисляем hash символов подстроки
    int hash = getHashCodeList3(substr.toCharArray());

    // Находим все подстроки, которые подходят по условие
    int size = input.length();
    int len = substr.length();
    // Нарезаем отрезки скользящим деревом
    for (int i = 0, end = i + len; end < size; i++) {
      end = i + len;
      String cut = input.substring(i, end);
      int hashCut = getHashCodeList3(cut.toCharArray());
      if (hashCut == hash) {
        list.add(cut);
      }
    }
    return list;
  }


  /**
   * Возвращает hash списка строк. Недостатком этого является то, что хеш для {"x", "x"} такой же,
   * как хеш для {"y", "y"}. Не подошел, слишком большая коллизия.
   */
  public static int getHashCodeList1(char[] substr) {
    int hash = 0;
    if (substr == null) {
      return hash;
    }
    for (char ch : substr) {
      // Операция XOR (исключающее ИЛИ)
      hash = hash ^ Character.hashCode(ch);
    }
    return hash;
  }

  /**
   * Возвращает hash списка строк. Есть проблемы для {1, -1} и {2, -2}, но если используются строки
   * это не проблема. Не подошёл слишком большая коллизия.
   */
  public static int getHashCodeList2(char[] substr) {
    int hash = 0;
    if (substr == null) {
      return hash;
    }
    for (char ch : substr) {
      hash = hash + Character.hashCode(ch);
    }
    return hash;
  }

  /**
   * Получаем hash для каждого элемента, затем сортируем список hash значений. Возвращает hash
   * списка символов независимый от перестановок.
   */
  public static int getHashCodeList3(char[] substr) {
    int hash = 0;
    if (substr == null) {
      return hash;
    }
    List<Integer> codes = new ArrayList<>();
    for (char ch : substr) {
      codes.add(Character.hashCode(ch));
    }
    // Здесь можно задействовать сортировку Timsort (сортировка вставками, сложность O(n))
    Collections.sort(codes);
    for (Integer code : codes) {
      hash *= 251;
      hash += code;
    }
    return hash;
  }
}
