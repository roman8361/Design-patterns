package path04.lesson04.flyweight;

import static ru.iteco.structural.flyweight.Color.DARK_GREEN;

/**
 * WarningWindows.
 *
 * @author Ilya_Sukhachev
 */
public class SavedPositionWindows extends Windows {

    private static final int defaultX = 400;
    private static final int defaultY = 400;

    protected SavedPositionWindows(String text) {
        super(text);
        color = DARK_GREEN;
        System.out.println("DEBUG:Создалось окно с запомнеными координатами");
    }

    protected SavedPositionWindows(String text, WindowConfig windowConfig) {
        this(text);
        this.config = windowConfig;
    }

    @Override
    public void show() {
        System.out.printf("Тут показалось окно с заголовком %s, c текущими координатами ", config.getColor());
        System.out.println();
        System.out.println("Тут показалось предупреждение");
        System.out.println("==================");
        System.out.println(text);
    }
}
