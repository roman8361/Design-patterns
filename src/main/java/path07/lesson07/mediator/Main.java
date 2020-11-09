package path07.lesson07.mediator;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        var badDataGenerator = new BadDataGenerator();
        badDataGenerator.run();
        System.out.println();

        var goodDataGenerator1 = new GoodDataGenerator();
        var mediator1 = new DefaultConsoleWriterMediator(goodDataGenerator1, new ConsoleWriter());
        goodDataGenerator1.run();
        System.out.println();

        var goodDataGenerator2 = new GoodDataGenerator();
        var mediator2 = new RedConsoleWriterMediator(goodDataGenerator2, new RedConsoleWriter());
        goodDataGenerator2.run();
        System.out.println();
    }
}
