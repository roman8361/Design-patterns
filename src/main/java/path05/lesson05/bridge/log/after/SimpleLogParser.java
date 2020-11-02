package path05.lesson05.bridge.log.after;

import java.time.LocalDateTime;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

/**
 * SimpleLogParser.
 *
 * @author Ilya_Sukhachev
 */
public class SimpleLogParser implements ILogParser {
    @Override
    public Iterable<LogEntry> parse(String text) {
        return Arrays.stream(text.split("\n"))
                .map(s -> new LogEntry(LocalDateTime.now(), s))
                .collect(toList());
    }
}
