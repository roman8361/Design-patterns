package path05.lesson05.bridge.log.before;

import java.time.LocalDateTime;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

/**
 * SimpleConsoleLogger.
 *
 * @author Ilya_Sukhachev
 */
public class SimpleConsoleLogger extends ConsoleLogger {
    @Override
    protected Iterable<LogEntry> parse(String text) {
        return Arrays.stream(text.split("\n"))
                .map(s -> new LogEntry(LocalDateTime.now(), s))
                .collect(toList());
    }
}
