package ru.ajana.work.insideclass;

import ru.ajana.work.insideclass.WithInner;

/**
 * Created by Андрей on 21.12.2015.
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi){
        wi.super();
    }
}
