package ru.ajana.work.task;

public class AppTask3 {

    public AppTask3() {
    }

    public static void main(String[] args) {
        Double d1 = Math.pow(10, 100);
        Double d2 = Math.pow(10, -100);
        System.out.println(d1);
        System.out.println(d2);
        Double v = d1 + d2;
        System.out.println(v);         
        System.out.println(Math.pow(2, 64)/2);
    }

}
