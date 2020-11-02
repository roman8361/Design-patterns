package path04.lesson04.decorator.coffeeshop;

/**
 * Milk.
 *
 * @author Ilya_Sukhachev
 */
public class Milk extends CoffeeDecorator implements CoffeeIngredient {

    public Milk(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("Milk");
        super.showIngredient();
    }
}
