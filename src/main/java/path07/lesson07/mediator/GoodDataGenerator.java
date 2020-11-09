package path07.lesson07.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * GoodDataGenerator.
 *
 * @author Ilya_Sukhachev
 */
public class GoodDataGenerator {

    private IWriterMediator writerMediator;
    private List<String> data;

    {
        data = new ArrayList<>();
        data.add("str_1");
        data.add("str_2");
        data.add("str_3");
        data.add("str_4");
        data.add("str_5");
    }

    public void run() {
        for (String datum : data) {
            writerMediator.updateData(datum);
        }
    }

    public IWriterMediator getWriterMediator() {
        return writerMediator;
    }

    public void setWriterMediator(IWriterMediator writerMediator) {
        this.writerMediator = writerMediator;
    }
}
