package ru.ajana.work.spring.scheduling;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.springframework.scheduling.support.CronExpression;

public class ScheduledSample {
    public static void main(String[] args) {
        final CronExpression expression = CronExpression.parse("0 0 0/1 ? * *");
        final java.time.LocalDateTime start = expression.next(java.time.LocalDateTime.parse("2021-07-29T00:00:00"));

        Arrays.asList(start).stream().reduce(start, (d1, d2) -> {
                    java.time.LocalDateTime result = expression.next(d1);
                    System.out.println(result);
                    return result;
                }
        );



    }
}
