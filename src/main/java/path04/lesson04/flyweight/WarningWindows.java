package path04.lesson04.flyweight;

import static path04.lesson04.flyweight.Color.DARK_GREEN;


/**
 * WarningWindows.
 *
 * @author Ilya_Sukhachev
 */
public class WarningWindows extends Windows {

    private static final int defaultX = 400;
    private static final int defaultY = 400;

    protected WarningWindows(String text) {
        super(text);
        color = DARK_GREEN;
        System.out.println("Создалось окно с предупреждением");
    }

    protected WarningWindows(String text, WindowConfig windowConfig) {
        this(text);
        this.config = windowConfig;
    }

    @Override
    public void show() {
        config.setPositionX(defaultX);
        config.setPositionY(defaultY);
        System.out.println("Тут показалось предупреждение");
        System.out.println("==================");
        System.out.println(text);
    }

}
