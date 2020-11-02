package path04.lesson04.flyweight;

import static ru.iteco.structural.flyweight.Color.RED;

/**
 * WindowConfig.
 *
 * @author Ilya_Sukhachev
 */
public class WindowConfig {

    private String title;
    private Color color;
    private int PositionX;
    private int PositionY;

    public WindowConfig(String title) {
        color = RED;
        System.out.println("DEBUG:Вызвался тяжеловесный конструктор");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPositionX() {
        return PositionX;
    }

    public void setPositionX(int positionX) {
        PositionX = positionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public void setPositionY(int positionY) {
        PositionY = positionY;
    }
}
