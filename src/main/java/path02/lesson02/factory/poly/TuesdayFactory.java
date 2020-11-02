package path02.lesson02.factory.poly;

/**
 * TuesdayFactory.
 *
 * @author Ilya_Sukhachev
 */
public class TuesdayFactory extends AbstractLunchFactory {

    public TuesdayFactory() {
        super();
    }

    @Override
    public HotDish getHotDish() {
        return new Pasta();
    }

    @Override
    protected Double getHotDishCost() {
        return 50.5;
    }

    @Override
    protected Double getDessertCost() {
        return 43.5;
    }

    @Override
    protected Dessert getDessert() {
        return new IceCream();
    }

//    @Override
//    public HotDish createHotDish() {
//        Pasta pasta = new Pasta();
//        menu.addToMenu(pasta, 50.5);
//        return pasta;
//    }
//
//    @Override
//    public Dessert createDessert() {
//        return new IceCream();
//    }
}
