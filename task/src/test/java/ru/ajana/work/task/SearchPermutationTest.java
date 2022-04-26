package ru.ajana.work.task;

import static org.junit.Assert.assertEquals;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

/**
 * Тест для SearchPermutation
 *
 * @author Andrey Kharintsev on 23.12.2018
 */
public class SearchPermutationTest {

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
    private static SecureRandom rnd = new SecureRandom();

    private String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }

    @Test
    public void testSearch() {
        String input = randomString(10_000_000) + "zxcqwe abc acb cba cab";
        String substr = "cba";
        System.out.println("input length: " + input.length());
        System.out.println("substr: " + substr);
        LocalDateTime start = LocalDateTime.now();
        List<String> list = SearchPermutation.search(input, substr);

        LocalDateTime stop = LocalDateTime.now();
        Duration duration = Duration.between(start, stop);
        System.out.println("Time: " + duration.toMillis());
        System.out.println(list);
    }

    @Test
    public void testGetHashCodeList1() {
        char[] substr1 = {'A', 'B', 'C'};
        int hash1 = SearchPermutation.getHashCodeList3(substr1);

        char[] substr2 = {'A', 'C', 'B'};
        int hash2 = SearchPermutation.getHashCodeList3(substr2);

        char[] substr3 = {'B', 'A', 'C'};
        int hash3 = SearchPermutation.getHashCodeList3(substr3);

        char[] substr4 = {'B', 'C', 'A'};
        int hash4 = SearchPermutation.getHashCodeList3(substr4);

        char[] substr5 = {'C', 'A', 'B'};
        int hash5 = SearchPermutation.getHashCodeList3(substr5);

        char[] substr6 = {'C', 'B', 'A'};
        int hash6 = SearchPermutation.getHashCodeList3(substr6);

        assertEquals(hash1, hash2);
        assertEquals(hash2, hash3);
        assertEquals(hash3, hash4);
        assertEquals(hash4, hash5);
        assertEquals(hash5, hash6);
    }
}