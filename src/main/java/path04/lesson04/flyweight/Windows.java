package path04.lesson04.flyweight;

/**
 * Windows.
 *
 * @author Ilya_Sukhachev
 */
public abstract class Windows {

    protected String text;
    protected WindowConfig config;
    protected Color color;

    protected Windows(String text) {
        this.text = text;
    }

    public abstract void show();
}
