package path05.lesson05.bridge.log.after;

/**
 * FileLogger.
 *
 * @author Ilya_Sukhachev
 */
public class FileLogger extends LoggerBase {

    private String fileName;

    public FileLogger(ILogParser parser, String fileName) {
        super(parser);
        this.fileName = fileName;
    }

    @Override
    protected void write(LogEntry entry) {
        //TODO записть лог в файл
    }
}
