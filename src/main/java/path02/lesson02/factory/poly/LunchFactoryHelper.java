package path02.lesson02.factory.poly;

import java.time.DayOfWeek;

/**
 * LunchFactoryHelper.
 * StaticFactoryMethod
 *
 * @author Ilya_Sukhachev
 */
public class LunchFactoryHelper {

    public static AbstractLunchFactory create(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return new MondayFactory();
            case THURSDAY:
                return new TuesdayFactory();
            default:
                throw new RuntimeException("Меню не применимо");
        }
    }
}
