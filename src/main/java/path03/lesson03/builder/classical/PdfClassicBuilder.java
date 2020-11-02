package path03.lesson03.builder.classical;

/**
 * PdfClassicBuilder.
 *
 * @author Ilya_Sukhachev
 */
public class PdfClassicBuilder extends AbstractClassicBuilder {

    @Override
    public AbstractClassicBuilder setFileName(String name) {
        this.name = name + ".pdf";
        return this;
    }

}
