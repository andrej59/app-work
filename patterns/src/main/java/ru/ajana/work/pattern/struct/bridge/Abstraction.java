package ru.ajana.work.pattern.struct.bridge;

/**
 * Абстракция.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public abstract class Abstraction {
    private Implementor implementor;

    public void operation() {
        implementor.operationImpl();
    }
}
