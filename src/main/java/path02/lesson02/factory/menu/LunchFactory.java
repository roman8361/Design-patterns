package path02.lesson02.factory.menu;

/**
 * ILunchFactory.
 *
 * @author Ilya_Sukhachev
 */
public interface LunchFactory {
    HotDish createHotDish();
    Dessert createDessert();
}
