package ru.ajana.work.task;

import java.util.ArrayList;
import java.util.List;

public class AppTask4 {

    public AppTask4() {
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
       
        if (list1.equals(list2)) {
            System.out.println("ArrayList: true");
        } else {
            System.out.println("ArrayList: false");
        }
    }
}
