package path05.lesson05.bridge.log.after;

/**
 * LoggerBase.
 *
 * @author Ilya_Sukhachev
 */
public abstract class LoggerBase {

    protected ILogParser parser;

    public LoggerBase(ILogParser parser) {
        this.parser = parser;
    }

    public void log(String text) {
        var entries = parser.parse(text);
        for (LogEntry entry : entries) {
            write(entry);
        }
    }

    protected abstract void write(LogEntry entry);
}
