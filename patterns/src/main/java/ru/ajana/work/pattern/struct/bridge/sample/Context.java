package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Контекс приложения.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public class Context {
    public static void main(String[] args) {
        Logger logger = new FileLogger("log.txt");
        logger.log("message");
    }
}
