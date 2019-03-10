package ru.ajana.work.pattern.behavior.iterator;

import java.util.List;

/**
 * Интерфейс аргегата.
 *
 * @author Andrey Kharintsev on 10.03.2019
 */
public interface Aggregate {

  List<Object> getItems();

  Iterator createIterator();
}
