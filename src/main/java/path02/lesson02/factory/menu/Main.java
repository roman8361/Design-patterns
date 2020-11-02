package path02.lesson02.factory.menu;

import java.time.DayOfWeek;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        //Меню на понедельник
        var mondayFactory = new MondayFactory();
        PrintMenu(mondayFactory);

        //Меню на вторник
        var tuesdayFactory = new TuesdayFactory();
        PrintMenu(tuesdayFactory);

        LunchFactoryHelper.create(DayOfWeek.MONDAY);
    }

    public static void PrintMenu(LunchFactory factory) {
        System.out.println("==== Меню на сегодня ======");

        var dish = factory.createHotDish();
        System.out.printf("Основное блюдо: %s", dish.getName());
        System.out.println();

        var dessert = factory.createDessert();
        System.out.printf("Дессерт: %s", dessert.getName());
        System.out.println("==========");
        System.out.println();

    }

    public static void PrintMenu(DayOfWeek dayOfWeek) {
        var factory = LunchFactoryHelper.create(dayOfWeek);
        PrintMenu(factory);
    }
}
