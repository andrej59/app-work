package ru.ajana.work.pattern.behavior.templatemethod.sample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class Client {

  public static void main(String[] args) {
    List<Integer> list = Stream.of(1, 2, 3).collect(Collectors.toList());

    Sort acs = new SortAscending(list);
    System.out.println("acs: " + acs.sort());

    Sort desc = new SortDescending(list);
    System.out.println("desc: " + desc.sort());
  }
}
