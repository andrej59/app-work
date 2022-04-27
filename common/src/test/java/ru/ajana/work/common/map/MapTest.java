package ru.ajana.work.common.map;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

import ru.ajana.work.common.model.CustomUser;

public class MapTest {
  @Test
  public void testTreeMap() {
    // Отсортировать объекты по ключам в обратном порядке
    Comparator<String> comparator = (o1, o2) -> o2.compareTo(o1);

    Map<String, CustomUser> userMap = new TreeMap<>();
    // Map<String, CustomUser> userMap = new TreeMap<>(Comparator.reverseOrder());
    // Map<String, CustomUser> userMap = new TreeMap<>(Comparator.naturalOrder());
    //

    userMap.put("a", new CustomUser(1, "a", LocalDateTime.now()));
    userMap.put("b", new CustomUser(2, "b", LocalDateTime.now()));
    userMap.put("c", new CustomUser(3, "c", LocalDateTime.now()));

    for (Map.Entry entry : userMap.entrySet()) {
      System.out.println(entry.getKey());
    }
  }

  @Test
  public void testTreeSet() {
    Set<CustomUser> set = new TreeSet<>(Comparator.comparing(u -> u.getId()));
  }
}
