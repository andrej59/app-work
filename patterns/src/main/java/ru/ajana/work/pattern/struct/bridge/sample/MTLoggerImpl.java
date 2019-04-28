package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Реализация для много поточного приложения.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public class MTLoggerImpl implements LoggerImpl {
    @Override
    public void consoleLog(String str) {
        System.out.println("Multithreaded console logger: " + str);
    }

    @Override
    public void fileLog(String file, String str) {
        System.out.println("Multithreaded file logger: " + str);
    }

    @Override
    public void socketLog(String host, int port, String str) {
        System.out.println("Multithreaded socket logger: " + str);
    }
}
