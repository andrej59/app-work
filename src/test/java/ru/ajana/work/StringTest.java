package ru.ajana.work;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Created by Андрей on 20.12.2015.
 */
public class StringTest {

  @Test
  public void testFormater() throws UnsupportedEncodingException {
        /*
         //MessageFormat.format();
        DecimalFormat df = new DecimalFormat("999999.99");
        System.out.println(df.format(122202222.23423));

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf.format(new Date()));
        */
    //var a = 123;

    List<String> one = new ArrayList<String>();
    one.add("abc");
    List<String> two = new ArrayList<String>();
    two.add("abc");
    if (one == two) {
      System.out.println("A");
    } else if (one.equals(two)) {
      System.out.println("B");
    } else {
      System.out.println("C");
    }

  }
}
