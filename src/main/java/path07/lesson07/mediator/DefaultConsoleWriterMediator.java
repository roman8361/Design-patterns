package path07.lesson07.mediator;

/**
 * DefaultConsoleWriterMediator.
 *
 * @author Ilya_Sukhachev
 */
public class DefaultConsoleWriterMediator implements IWriterMediator {

    private ConsoleWriter consoleWriter;

    public DefaultConsoleWriterMediator(GoodDataGenerator dataGenerator, ConsoleWriter consoleWriter) {
        dataGenerator.setWriterMediator(this);
        this.consoleWriter = consoleWriter;
    }

    @Override
    public void updateData(String data) {
        consoleWriter.write(data);
    }
}
