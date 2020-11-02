package path04.lesson04.decorator.coffeeshop;

/**
 * CoffeeDecorator.
 *
 * @author Ilya_Sukhachev
 */
public abstract class CoffeeDecorator implements CoffeeIngredient {

    protected CoffeeIngredient innerIngredient;

    public CoffeeDecorator(CoffeeIngredient innerIngredient) {
        this.innerIngredient = innerIngredient;
    }

    @Override
    public void showIngredient() {
        if (innerIngredient != null) {
            innerIngredient.showIngredient();
        }
    }
}
