package path07.lesson07.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * BadDataGenerator.
 *
 * @author Ilya_Sukhachev
 */
public class BadDataGenerator {

    private ConsoleWriter consoleWriter;
    private List<String> data;

    {
        data = new ArrayList<>();
        data.add("str_1");
        data.add("str_2");
        data.add("str_3");
        data.add("str_4");
        data.add("str_5");
    }

    public BadDataGenerator() {
        consoleWriter = new ConsoleWriter();
    }

    public void run() {
        for (String datum : data) {
            consoleWriter.write(datum);
        }
    }
}
