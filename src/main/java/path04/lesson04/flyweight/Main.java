package path04.lesson04.flyweight;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {
    public static void main(String[] args) {
        var w1 = WindowsFactory.getWindows("Приветствие", "Добро пожаловать в пример");
        w1.show();

        var w2 = WindowsFactory.getWindows("Еще какое-то окно", "Какой то текст");
        w2.show();

        var w3 = WindowsFactory.getWindows("WARNING", "Опасное предупреждение");
        w3.show();

        var w4 = WindowsFactory.getWindows("WARNING", "Самое опасное предупреждение");
        w4.show();

        var w5 = WindowsFactory.getWindows("Приветствие", "И снова здраствуйте");
        w5.show();
    }

}
