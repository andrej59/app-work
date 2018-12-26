package ru.ajana.work.common;

import org.junit.Test;

/**
 * Created by Андрей on 12.12.2015.
 */
public class DemoBlackBoxTest {
    @Test
    public void testExample1() {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);
        System.out.println("Equals: "+object1.equals(object2));
        System.out.println("hashCode: "+(object1.hashCode() == object2.hashCode()));
    }
}
