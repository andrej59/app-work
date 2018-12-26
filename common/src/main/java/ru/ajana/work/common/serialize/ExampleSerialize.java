package ru.ajana.work.common.serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Второй способ сериализации объекта.
 *
 * Created by Андрей on 20.12.2015.
 */
public class ExampleSerialize implements Externalizable {

    public static void  main(){

    }

    @Override public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
