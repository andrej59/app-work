package ru.ajana.work.date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;
import org.junit.Test;

/**
 * @author Andrey Kharintsev on 09.03.2018
 */
public class DateTest {

  @Test
  public void testDate() {
    LocalDate localDate = LocalDate.now();
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalTime localTime = LocalTime.now();
    ZonedDateTime zonedDateTime = ZonedDateTime.now();

    Date date = new Date();
    System.out.println(Instant.now());

  }
}
