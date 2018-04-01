package ru.ajana.work.io;


import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.junit.Test;

/**
 * @author Andrey Kharintsev on 19.03.2018
 */
public class InputOutputTest {

  @Test
  public void testReader() {

  }

  @Test
  public void testDataInputStream() throws IOException {
    String srt = "dataInputStream";
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(srt.getBytes());
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    StringBuilder sb = new StringBuilder();
    while (dataInputStream.available() > 0) {
      sb.append(new String(new byte[]{dataInputStream.readByte()}));
    }

    System.out.println(sb.toString());
  }
}
