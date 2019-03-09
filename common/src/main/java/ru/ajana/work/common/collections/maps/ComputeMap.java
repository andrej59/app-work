package ru.ajana.work.common.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ComputeMap {

  public static void main(String[] args) {
    Map<Integer, String> computeMap = new HashMap<>();
    computeMap.put(1, "один");
    computeMap.put(2, "два");
    computeMap.put(3, "три");
    /**
     * Вызывает заданную функцию для построения нового
     * значения. Если функция возвращает не пустое значение,
     * то в отображение вводится новая пара "ключ-значение",
     * удаляется любая ранее существовавшая пара и возвращается новое значение.
     * А если функция возвращает пустое значение null, то удаляется
     * любая ранее существовавшая пара и возвращается
     * пустое значение null (добавлен в версииJDК 8).
     */

    Integer key1 = 5; // новый ключ
    computeMap.compute(key1, (k, v) -> k + "_" + v);
    print(computeMap);

    key1 = 2; // ключ к которому будет примена функция
    computeMap.compute(key1, (k, v) -> k + "_" + v);
    print(computeMap);

    computeMap.compute(key1, (k, v) -> null);
    print(computeMap);

    /**
     * Возвращает значение, связанное с указанным
     * ключом k. В противном случае создается новое значение,
     * для чего вызывается заданная функция, в отображение вводится новая пара "ключ-значение"
     * и возвращается созданное значение. Если же новое
     * значение создать нельзя, то возвращается пустое
     * значение null (добавлен в версииJDК 8)
     */
    computeMap.clear();
    computeMap.put(1, "один");

    computeMap.computeIfAbsent(1, k -> new String("два"));
    print(computeMap);

    computeMap.computeIfAbsent(2, k -> new String("два"));
    print(computeMap);

    /**
     * Если в отображении присутствует указанный ключ
     * k, то для создания нового значения вызывается заданная
     * функция и новое значение заменяет прежнее
     * в отображении. В этом случае возвращается новое
     * значение. Если же заданная функция возвращает
     * пустое значение null, то из отображения удаляются
     * существующие в нем ключ и значение и затем возвращается
     * пустое значение null (добавлен в версии JDК 8)
     */
    Integer key3 = 2;
    computeMap.clear();
    computeMap.put(key3, "два");
    computeMap.computeIfPresent(key3, (k, v) -> new String("три"));
    print(computeMap);

    computeMap.computeIfPresent(key3, (k, v) -> null);
    print(computeMap);
  }

  private static void print(Map<Integer, String> computeMap) {
    Stream.of(computeMap).forEach(System.out::println);
  }
}
