package path02.lesson02.factory.menu;

/**
 * SatudayFactory.
 *
 * @author Ilya_Sukhachev
 */
public class SaturdayFactory implements LunchFactory {
    @Override
    public HotDish createHotDish() {
        return new Puree();
    }

    @Override
    public Dessert createDessert() {
        return new IceCream();
    }
}
