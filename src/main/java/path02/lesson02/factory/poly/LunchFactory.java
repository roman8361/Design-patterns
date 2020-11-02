package path02.lesson02.factory.poly;

/**
 * ILunchFactory.
 *
 * @author Ilya_Sukhachev
 */
public interface LunchFactory {

    HotDish createHotDish();

    Dessert createDessert();

    Menu getMenu();
}
