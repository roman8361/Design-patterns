package path03.lesson03.builder.classical;

/**
 * ClassicBuilderDirector.
 *
 * @author Ilya_Sukhachev
 */
public class ClassicBuilderDirector {


    private ClassicBuilder classicBuilder;

    public ClassicBuilderDirector(ClassicBuilder classicBuilder) {
        this.classicBuilder = classicBuilder;
    }

    public void build(String name, String text) {
        classicBuilder.setFileName(name);
        classicBuilder.setBody(text);
    }

}
