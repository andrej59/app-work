package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Интерфейс для логера консоли.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger() {
        super(new STLoggerImpl());
    }

    @Override
    public void log(String str) {
        pImpl.consoleLog(str);
    }
}
