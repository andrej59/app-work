package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Интерфейс для логгера в файл.
 *
 * @author Andrey Kharintsev on 28.04.2019
 */
public class FileLogger extends Logger {
    private String file;

    public FileLogger(String file) {
        super(new STLoggerImpl());
        this.file = file;
    }

    @Override
    public void log(String str) {
        pImpl.fileLog(file, str);
    }
}
