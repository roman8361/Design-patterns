package path03.lesson03.prototype.deep;

/**
 * ColorSetting.
 *
 * @author Ilya_Sukhachev
 */
public class ColorSetting implements Cloneable {

    private String brightness;
    private Double transparency;

    public ColorSetting(String brightness, Double transparency) {
        this.brightness = brightness;
        this.transparency = transparency;
    }

    @Override
    protected ColorSetting clone()  {
        try {
            return (ColorSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public Double getTransparency() {
        return transparency;
    }

    public void setTransparency(Double transparency) {
        this.transparency = transparency;
    }
}
