package path05.lesson05.bridge.log.before;

import java.util.Collections;

/**
 * MultiLineConsoleLogger.
 *
 * @author Ilya_Sukhachev
 */
public class MultiLineConsoleLogger extends ConsoleLogger {
    @Override
    protected Iterable<LogEntry> parse(String text) {
        //TODO разбить текст по шаблону
        return Collections.EMPTY_LIST;
    }
}
