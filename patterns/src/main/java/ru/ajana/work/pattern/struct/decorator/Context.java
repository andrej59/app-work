package ru.ajana.work.pattern.struct.decorator;

/**
 * @author Andrey Kharintsev on 20.11.2018
 */
public class Context {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();

        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();
    }
}
