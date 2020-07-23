package ru.ajana.work.common.stream;

import java.util.stream.Stream;

public class ReduceSample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("-", (s, c) -> s + c);
        System.out.println(word);
    }
}
