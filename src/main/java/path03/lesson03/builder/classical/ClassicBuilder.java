package path03.lesson03.builder.classical;

/**
 * ClassicBuilder.
 *
 * @author Ilya_Sukhachev
 */
public interface ClassicBuilder {

    AbstractClassicBuilder setFileName(String name);
    AbstractClassicBuilder setBody(String text);
    File getResult();
}
