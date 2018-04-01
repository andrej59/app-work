package ru.ajana.work.io;

import java.io.File;
import java.io.FileFilter;
import org.junit.Test;

/**
 * @author Andrey Kharintsev on 19.03.2018
 */
public class FileFilterTest {

  @Test
  public void test() {
    FileFilter fileFilter = new FileFilter() {
      public boolean accept(File pathname) {
        return pathname.getName().indexOf("a") > -1;
      }
    };
    File f = new File("c:/test");
    File[] files = f.listFiles(fileFilter);
  }
}
