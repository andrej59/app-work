package ru.ajana.work.pattern.behavior.templatemethod.sample;

import java.util.List;

/**
 * Алгоритм обратной сортировки.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public class SortDescending extends SortAlgorithm {

  public SortDescending(List<Integer> list) {
    super(list);
  }

  @Override
  protected int compare(Integer o1, Integer o2) {
    return o1 == o2 ? 0 : (o1 > o2 ? -1 : 1);
  }
}
