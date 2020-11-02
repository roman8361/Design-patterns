package path03.lesson03.prototype.clone;

/**
 * Color.
 *
 * @author Ilya_Sukhachev
 */
public class Color implements Cloneable {

    private String code;
    private String name;
    private ColorSetting setting;

    public Color(String code, String name, ColorSetting setting) {
        this.code = code;
        this.name = name;
        this.setting = setting;
    }

    @Override
    protected Color clone()  {
        try {
            return (Color) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColorSetting getSetting() {
        return setting;
    }

    public void setSetting(ColorSetting setting) {
        this.setting = setting;
    }
}
