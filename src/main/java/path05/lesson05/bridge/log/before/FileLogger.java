package path05.lesson05.bridge.log.before;

/**
 * FileLogger.
 *
 * @author Ilya_Sukhachev
 */
public abstract class FileLogger extends LoggerBase {

    private String fileName;

    protected FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected void write(LogEntry entry) {
        //TODO записть лог в файл
    }
}
