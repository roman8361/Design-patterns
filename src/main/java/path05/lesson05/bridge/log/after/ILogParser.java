package path05.lesson05.bridge.log.after;

/**
 * ILogParser.
 *
 * @author Ilya_Sukhachev
 */
public interface ILogParser {

    Iterable<LogEntry> parse(String text);
}
