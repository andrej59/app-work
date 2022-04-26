package ru.ajana.work.common.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Kharintsev on 11.06.2019
 */
public class Sample3 {

  public static void main(String[] args) {
    {
      String[] strings = new String[2];
      Object[] objects = strings;  // valid, String[] is Object[]
      objects[0] = 12; // error, would cause java.lang.ArrayStoreException: java.lang.Integer during runti
    }
    {
//      List<String> strings = new ArrayList<>();
//      List<Object> objects = strings;  // let say it is valid
//      objects.add(12);  // invalid, Integer should not be put into List<String> but there is no information during runtime to catch this
    }
  }
}
