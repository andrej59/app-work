package ru.ajana.work.pattern.generate.abstractfactory;

/**
 * Интерфейс абстрактной фабрик.
 *
 * @author Andrey Kharintsev on 24.11.2018
 */
public interface AbstractFactory {

  AbstractProduct createProductA();

  AbstractProduct createProductB();
}
