package ru.ajana.work.insideclass;

/**
 * Created by Андрей on 20.12.2015.
 */
public class OuterClass {
    public static class StaticNestedClass {
        public void m1(){
        }
    }

    /**
     * Внутренний класс.
     */
    public class Inner {
        public int id;
        private  void m2(){
            Nested clazz = new Nested();
            clazz.m3();
        }
    }
    /**
     * Вложенный класс.
     */
    public static class Nested{
        private static int id;
        private String name;
        private void m3(){
        }
    }

    public static void  main(String[] args){
    }
}
