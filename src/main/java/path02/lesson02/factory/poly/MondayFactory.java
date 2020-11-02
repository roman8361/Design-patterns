package path02.lesson02.factory.poly;

/**
 * MondayFactory.
 *
 * @author Ilya_Sukhachev
 */
public class MondayFactory extends AbstractLunchFactory {

    public MondayFactory() {
        super();
    }

    @Override
    public HotDish getHotDish() {
        return new Puree();
    }

    @Override
    protected Double getHotDishCost() {
        return 40.5;
    }

    @Override
    protected Double getDessertCost() {
        return 70.5;
    }

    @Override
    protected Dessert getDessert() {
        return new Muffin();
    }

//    public HotDish createHotDish() {
//        Puree puree = new Puree();
//        menu.addToMenu(puree, 40.5);
//        return puree;
//    }
//
//    public Dessert createDessert() {
//        Muffin muffin = new Muffin();;
//        menu.addToMenu(muffin, 70.5);
//        return muffin;
//    }
}
