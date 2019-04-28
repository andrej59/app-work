package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Реализация для однопоточного приложения.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public class STLoggerImpl implements LoggerImpl {
    @Override
    public void consoleLog(String str) {
        System.out.println("Single-threaded console logger: " + str);
    }

    @Override
    public void fileLog(String file, String str) {
        System.out.println("Single-threaded file logger: " + str);
    }

    @Override
    public void socketLog(String host, int port, String str) {
        System.out.println("Single-threaded socker logger: " + str);
    }
}
