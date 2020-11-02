package path03.lesson03.prototype.load;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private Map<String, Color> colors = new HashMap<>();

    public PrototypeFactory() {
        loadDefaultItems();
    }

    // cloning
    public Color cloneColor(String type) {
        Color color = (colors.get(type)).clone();
        return color;
    }

    private void loadDefaultItems() {
        Color redColor = new RedColor("#FF0000");
        colors.put("RedColor", redColor);

        Color transparentRedColor = new TransparentRedColor("#FF0000", 50);
        colors.put("TransparentRedColor", transparentRedColor);
    }
}
