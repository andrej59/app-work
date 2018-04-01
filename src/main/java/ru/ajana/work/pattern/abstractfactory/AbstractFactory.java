package ru.ajana.work.pattern.abstractfactory;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Андрей on 20.12.2015.
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA() throws ParserConfigurationException ;
    public abstract AbstractProductB createProductB();
}
