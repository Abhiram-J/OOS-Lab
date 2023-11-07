class Logger {
    public enum LogLevel {
        WARNING,
        ERROR,
        FATAL
    }

    private static Logger instance = null;
    private LogLevel logLevel = LogLevel.WARNING;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLogLevel(LogLevel level) {
        logLevel = level;
    }

    public void log(LogLevel level, String message) {
        if (level.ordinal() >= logLevel.ordinal()) {
            System.out.println("[" + level + "] " + message);
        }
    }

    public void warning(String message) {
        log(LogLevel.WARNING, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void fatal(String message) {
        log(LogLevel.FATAL, message);
    }

}

public class Q1 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.setLogLevel(Logger.LogLevel.ERROR);

        logger.warning("This is a warning message.");
        logger.error("This is an error message.");
        logger.fatal("This is a fatal error message.");
    }
}
