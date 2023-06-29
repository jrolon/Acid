package utilities;

import org.apache.logging.log4j.*;

public class LoggerHandler {

    public enum logType {
        DEBUG, ERROR, FATAL, INFO, WARNING
    }

    private static Logger log = LogManager.getLogger("LoggerHandler");

    /**
     * Description: Performs the log recording according to the message sent and the type of log to use
     * Date: 24/04/2023
     *
     * @author danielramirezs
     * ChangeLog:
     */
    public static void registerInfo(Class classToUse, logType type, String message) {
        log = LogManager.getLogger(classToUse);

        switch (type) {
            case DEBUG -> log.debug(message);
            case ERROR -> log.error(message);
            case FATAL -> log.fatal(message);
            case INFO -> log.info(message);
            case WARNING -> log.warn(message);
        }
    }
}
