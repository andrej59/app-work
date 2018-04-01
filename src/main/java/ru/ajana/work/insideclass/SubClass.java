package ru.ajana.work.insideclass;

import ru.ajana.work.insideclass.OuterClass.StaticNestedClass;

/**
 * Created by Андрей on 20.12.2015.
 */
public class SubClass  extends StaticNestedClass  {
    public SubClass() {
        super.m1();
        m1();
    }
}
