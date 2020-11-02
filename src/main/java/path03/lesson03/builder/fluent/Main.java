package path03.lesson03.builder.fluent;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        runCustomStringBuilder();
    }

    private static void runCustomStringBuilder() {
        var stringBuilder = new StringBuilder();
//        var stringBuilder = new CustomStringBuilder();

        stringBuilder.appendLine("text_1");
        System.out.println(stringBuilder.getResult());

        stringBuilder.appendLine("text_2").appendFormat("text_%s", 3);
        System.out.println(stringBuilder.getResult());
    }
}
