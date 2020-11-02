package path05.lesson05.bridge.log.before;

/**
 * ConsoleLogger.
 *
 * @author Ilya_Sukhachev
 */
public abstract class ConsoleLogger extends LoggerBase {

    @Override
    protected void write(LogEntry entry) {
        System.out.println(entry.getDate() + " : " + entry.getMessage());
    }
}
