package path03.lesson03.prototype.load;

/**
 * RedColor.
 *
 * @author Ilya_Sukhachev
 */
public class TransparentRedColor extends RedColor {

    private double transparent;

    public TransparentRedColor(String code, double transparent) {
        super(code);
        this.transparent = transparent;
    }

    public double getTransparent() {
        return transparent;
    }

    public void setTransparent(double transparent) {
        this.transparent = transparent;
    }
}
