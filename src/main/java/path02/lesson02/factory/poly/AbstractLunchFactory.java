package path02.lesson02.factory.poly;

/**
 * ILunchFactory.
 *
 * @author Ilya_Sukhachev
 */
public abstract class AbstractLunchFactory implements LunchFactory {

    protected Menu menu;
//    protected Coordinator coordinator;

    public AbstractLunchFactory() {
        this.menu = new Menu();
//        this.coordinator = coordinator;
    }

    @Override
    public HotDish createHotDish() {
        HotDish hotDish = getHotDish();
        menu.addToMenu(hotDish, getHotDishCost());
//        HotDish hotDish = coordinator.getHotDish();
//        menu.addToMenu(hotDish, coordinator.getHotDishCost());
        return hotDish;
    }

    public abstract HotDish getHotDish();
    protected abstract Double getHotDishCost();

    @Override
    public Dessert createDessert() {
        Dessert dessert = getDessert();
        menu.addToMenu(dessert, getDessertCost());
        return dessert;
    }

    protected abstract Double getDessertCost();
    protected abstract Dessert getDessert();

    @Override
    public Menu getMenu() {
        return menu;
    }
}
