package ru.ajana.work.pattern.struct.bridge.sample;

/**
 * Интерфейс для логгера в сокет.
 */
public class SocketLogger extends Logger {
    private String host;
    private int port;

    public SocketLogger(String host, int port) {
        super(new MTLoggerImpl());
        this.host = host;
        this.port = port;
    }

    @Override
    public void log(String str) {
        pImpl.socketLog(host, port, str);
    }
}
