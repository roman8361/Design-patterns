package path02.lesson02.factory.poly;

import java.util.HashMap;
import java.util.Map;

/**
 * Menu.
 *
 * @author Ilya_Sukhachev
 */
public class Menu {

    private Map<MenuItem, Double> prizes = new HashMap<>();

    public void  addToMenu(MenuItem menuItem, Double cost) {
        prizes.put(menuItem, cost);
    }

    Double getCost(MenuItem menuItem) {
        return prizes.get(menuItem);
    }
}
