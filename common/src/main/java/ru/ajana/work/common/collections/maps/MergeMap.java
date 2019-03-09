package ru.ajana.work.common.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MergeMap {

  public static void main(String[] args) {
    Map<Integer, String> mergeMap = new HashMap<>();
    mergeMap.put(1, "один");
    mergeMap.put(2, "два");
    mergeMap.put(3, "три");

    /**
     * Если в вызывающем отображении отсутствует
     * указанный ключ k, то в него вводится пара "ключ-значение",
     * определяемая параметрами k, v, а затем
     * возвращается значение v. В противном случае заданная
     * функция возвращает новое значение, исходя из
     * прежнего значения и ключ обновляется для доступа
     * к этому значению, а затем оно возвращается из метода
     * merge(). Если же заданная функция возвращает
     * пустое значение null, то ключ и значения, существующие
     * в вызывающем отображении, удаляются
     * из него и затем возвращается пустое значение null
     * (добаален в версииJDК 8)
     */

    Integer key = 5;
    mergeMap.merge(key, "пять", (oldValue, newValue) -> oldValue + "_" + newValue);
    print(mergeMap);

    key = 1;
    mergeMap.merge(key, "новый", (oldValue, newValue) -> oldValue + "_" + newValue);
    print(mergeMap);

    mergeMap.merge(key, "новый", (oldValue, newValue) -> null);
    print(mergeMap);
  }

  private static void print(Map<Integer, String> computeMap) {
    Stream.of(computeMap).forEach(System.out::println);
  }
}
