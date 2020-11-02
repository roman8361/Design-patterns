package path03.lesson03.builder.classical;

/**
 * IClassicBuilder.
 *
 * @author Ilya_Sukhachev
 */
public abstract class AbstractClassicBuilder implements  ClassicBuilder {

    protected String name;
    protected String text;

    @Override
    public AbstractClassicBuilder setBody(String text) {
        this.text = text;
        return this;
    }

    @Override
    public File getResult() {
        return new File(name, text);
    }
}
