package path03.lesson03.builder.classical;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        var builders = new ClassicBuilder[] { new PdfClassicBuilder(), new XlsxClassicBuilder() };

        for (ClassicBuilder builder : builders) {
            var director = new ClassicBuilderDirector(builder);
            director.build("name_1", "text_1");
            var file = builder.getResult();
            System.out.println(file.toString());
        }
    }
}
