package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Абстракция логгера.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public abstract class Logger {
    protected LoggerImpl pImpl;

    public Logger() {
    }

    public Logger(LoggerImpl pImpl) {
        this.pImpl = pImpl;
    }

    public abstract void log(String str);
}
