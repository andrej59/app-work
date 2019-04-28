package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Опережающее объявление.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public interface LoggerImpl {
    /**
     * Запись лога в консоль.
     *
     * @param str
     */
    void consoleLog(String str);

    /**
     * Запись лога в файл.
     *
     * @param file
     * @param str
     */
    void fileLog(String file, String str);

    /**
     * Запись лога в сокет.
     *
     * @param host
     * @param port
     * @param str
     */
    void socketLog(String host, int port, String str);
}
