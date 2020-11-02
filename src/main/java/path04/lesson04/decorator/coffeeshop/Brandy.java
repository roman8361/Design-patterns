package path04.lesson04.decorator.coffeeshop;

/**
 * Brandy.
 *
 * @author Ilya_Sukhachev
 */
public class Brandy extends CoffeeDecorator implements CoffeeIngredient {

    public Brandy(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("Brandy");
        super.showIngredient();
    }
}
