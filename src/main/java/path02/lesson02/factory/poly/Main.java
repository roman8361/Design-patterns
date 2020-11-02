package path02.lesson02.factory.poly;

import java.time.DayOfWeek;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        LunchFactory lunchFactory = LunchFactoryHelper.create(DayOfWeek.MONDAY);
        lunchFactory.createDessert();
    }
}
