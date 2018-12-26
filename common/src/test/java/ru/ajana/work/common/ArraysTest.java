package ru.ajana.work.common;


import org.junit.Test;

/**
 * Created by Андрей on 20.12.2015.
 */
public class ArraysTest {
    public void ap(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print((char) a[i] + " ");
        }
        System.out.println();
    }

    @Test
    public  void testRevers() {
        String str = "123456789";

        char[] arrStr = str.toCharArray();
        int[] a = new int[arrStr.length];
        int c = 0;
        for (char v: arrStr){
            a[c] = (int)v;
            c++;
        }

        // b = a ^ b; a = b ^ a; b = a ^ b;
        // b = a + b; a = b - a; b = b - a;
        //a = a + b; b = a - b; a = a - b;
        //int[] a = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < a.length / 2; i++) {
            a[i] = a[i] + a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i] - a[a.length - 1 - i];
            a[i] = a[i] - a[a.length - 1 - i];
        }
        ap(a);
    }
}
