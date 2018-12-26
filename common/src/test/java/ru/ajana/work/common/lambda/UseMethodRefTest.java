package ru.ajana.work.common.lambda;

import static java.lang.ThreadLocal.withInitial;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Andrey Kharintsev on 04.03.2018
 */
public class UseMethodRefTest {

  @Ignore
  @Test
  public void test() throws IOException {
    MyClazz test = new MyClazz(1);

    List<MyClazz> al = new ArrayList<>();
    al.add(new MyClazz(1));
    al.add(new MyClazz(3));

    MyClazz max = Collections.max(al, UseMethodRef::compareMC);

    List<MyClazz> result = al.stream().filter(a -> "".equals(a.getValue()))
        .collect(Collectors.toList());

    String[] strings = {"1", "12", "123"};

    Map<String, Integer> data = new LinkedHashMap<>();
    data.put("1", 5);
    data.put("12", null);
    data.put("123", 7);

    for (String s : strings) {
      data.merge(s, 1, (a, b) -> a + b);
    }
    System.out.println(data);

// Java 7 и ранее
    ThreadLocal<Object> mapper = new ThreadLocal<Object>() {
      @Override
      protected Object initialValue() {
        return new Object();
      }
    };

    ThreadLocal<Object> mapper1 = withInitial(() -> new Object());

    double mean = (int) Files.lines(new File("file").toPath())
        .mapToInt(Integer::parseInt)
        .summaryStatistics()
        .getAverage();

  }
}