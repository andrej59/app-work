package ru.ajana.work.pattern.generate.singleton;

/**
 * Класс экземпляра-одиночки.
 *
 * @author Andrey Kharintsev on 17.12.2018
 */
public class SingletonLazy {

    private volatile SingletonLazy INSTANCE;

    private SingletonLazy() {
    }

    public SingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazy.class) {
                //double checking Singleton instance
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazy();
                }
            }
        }
        return INSTANCE;
    }
}
