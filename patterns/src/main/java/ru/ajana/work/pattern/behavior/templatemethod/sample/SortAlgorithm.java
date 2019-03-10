package ru.ajana.work.pattern.behavior.templatemethod.sample;

import java.util.List;

/**
 * Алгоритм сортировки.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public abstract class SortAlgorithm implements Sort {

  private List<Integer> list;

  public SortAlgorithm(List<Integer> list) {
    this.list = list;
  }

  @Override
  public List<Integer> sort() {
    processArray();
    return returnArray();
  }

  public List<Integer> returnArray() {
    return list;
  }

  public void processArray() {
    list.sort((o1, o2) -> compare(o1, o2));
  }

  protected int compare(Integer o1, Integer o2) {
    return o1 == o2 ? 0 : (o1 > o2 ? 1 : -1);
  }
}
