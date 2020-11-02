package path05.lesson05.bridge.log.before;

/**
 * LoggerBase.
 *
 * @author Ilya_Sukhachev
 */
public abstract class LoggerBase {

    public void log(String text) {
        var entries = parse(text);
        for (LogEntry entry : entries) {
            write(entry);
        }
    }

    protected abstract Iterable<LogEntry> parse(String text);

    protected abstract void write(LogEntry entry);
}
