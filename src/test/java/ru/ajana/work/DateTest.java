package ru.ajana.work;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Андрей on 21.12.2015.
 */
public class DateTest {
    @Test
    public void testDate() {
        Date date1 = new Date();
        //Date date2 = new Date(120000121); // кол-во миллисекунд с 1 янв. 1970
        Calendar calendar = Calendar.getInstance();
        //calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        calendar.setTime(date1);
        System.out.println("Дата: ");
        System.out.println(
            calendar.get(Calendar.DATE) + ":" + calendar.get(Calendar.MONTH) + ":" + calendar.get(Calendar.YEAR));
        System.out.println("Время: ");

        System.out.print(
            calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        System.out.println();

        System.out.print(calendar.getTime());

    }
}
