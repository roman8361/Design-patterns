package path03.lesson03.builder.classical;

/**
 * XlsxClassicBuilder.
 *
 * @author Ilya_Sukhachev
 */
public class XlsxClassicBuilder extends AbstractClassicBuilder {

    @Override
    public AbstractClassicBuilder setFileName(String name) {
        this.name = name + ".xlsx";
        return this;
    }
}
