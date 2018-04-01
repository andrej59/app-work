package ru.ajana.work.pattern.abstractfactory;

import ru.ajana.work.pattern.abstractfactory.AbstractFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Андрей on 20.12.2015.
 */
public class ConcretFactory1  extends AbstractFactory {


    @Override public  AbstractProductA  createProductA() throws ParserConfigurationException {
        //DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance("factoryName", Class.class.getClassLoader());
        //DocumentBuilder  documentBuilder = documentBuilderFactory.newDocumentBuilder();
        //documentBuilder.parse("fileName");
        return null;
    }

    @Override public AbstractProductB createProductB() {
        return null;
    }
}
