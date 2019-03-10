package ru.ajana.work.pattern.behavior.iterator;

/**
 * Интерфейс итератора.
 *
 * @author Andrey Kharintsev on 09.03.2019
 */
public interface Iterator {

  boolean next();

  Object getCurrentItem();
}
