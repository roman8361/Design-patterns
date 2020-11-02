package path02.lesson02.factory.menu;

import java.time.DayOfWeek;

/**
 * LunchFactoryHelper.
 * StaticFactoryMethod
 *
 * @author Ilya_Sukhachev
 */
public class LunchFactoryHelper {

    public static LunchFactory create(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return new MondayFactory();
            case THURSDAY:
                return new TuesdayFactory();
            case SATURDAY:
                return new SaturdayFactory();
            default:
                throw new RuntimeException("Меню не применимо");
        }
    }
}
