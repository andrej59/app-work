package ru.ajana.work.common.generic;


import java.util.ArrayList;
import java.util.Collection;

class Base {
  public <T> Collection<T> transform(Collection<T> list) {
    return new ArrayList<T>();
  }
}

class Derived extends
    Base {

//  public <T> Collection<T> transform(Collection<T> list) {
//    return new HashSet<String>();
//  }


//  public <T> Collection<T> transform(Stream<T> list) {
//    return new HashSet<T>();
//  }

//  public <T> List<T> transform(Collection<T> list) {
//    return new ArrayList<T>();
//  }

//  public <X> Collection<X> transform(Collection<X> list) {
//    return new HashSet<X>();
//  }

//  public Collection<CharSequence> transform(Collection<CharSequence> list) {
//    return new HashSet<CharSequence>();
//  }
}

public class Sample1 {

}
