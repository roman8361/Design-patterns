package path05.lesson05.bridge.log.after;

/**
 * ConsoleLogger.
 *
 * @author Ilya_Sukhachev
 */
public class ConsoleLogger extends LoggerBase {

    public ConsoleLogger(ILogParser parser) {
        super(parser);
    }

    @Override
    protected void write(LogEntry entry) {
        System.out.println(entry.getDate() + " : " + entry.getMessage());
    }
}
