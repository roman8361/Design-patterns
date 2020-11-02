package path05.lesson05.bridge.log.before;

import java.util.Collections;

/**
 * MultiLineFileLogger.
 *
 * @author Ilya_Sukhachev
 */
public class MultiLineFileLogger extends FileLogger {

    protected MultiLineFileLogger(String fileName, String delimTemplate) {
        super(fileName);
    }

    @Override
    protected Iterable<LogEntry> parse(String text) {
        //TODO разбить текст по шаблону
        return Collections.EMPTY_LIST;
    }
}
