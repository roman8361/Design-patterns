package path04.lesson04.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * WindowsFactory.
 *
 * @author Ilya_Sukhachev
 */
public class WindowsFactory {

    private static List<WindowConfig> cache = new ArrayList<>();

    public static Windows getWindows(String title, String text) {
        if (cache.stream().allMatch(windowConfig -> windowConfig.getTitle() != title)) {
            cache.add(new WindowConfig(title));
        }
        var result = cache.stream()
                .filter(windowConfig -> windowConfig.getTitle() == title)
                .findFirst()
                .get();

        return result.getTitle().equals("WARNING")
                ? new WarningWindows(text, result)
                : new SavedPositionWindows(text, result);
    }
}
