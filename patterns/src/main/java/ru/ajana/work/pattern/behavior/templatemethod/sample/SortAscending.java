package ru.ajana.work.pattern.behavior.templatemethod.sample;

import java.util.List;

/**
 * Алгоритм прямой сортировки.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class SortAscending extends SortAlgorithm {

  public SortAscending(List<Integer> list) {
    super(list);
  }

  @Override
  protected int compare(Integer o1, Integer o2) {
    return o1 == o2 ? 0 : (o1 > o2 ? 1 : -1);
  }
}
