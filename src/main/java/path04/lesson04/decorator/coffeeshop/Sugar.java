package path04.lesson04.decorator.coffeeshop;

/**
 * Sugar.
 *
 * @author Ilya_Sukhachev
 */
public class Sugar
        extends CoffeeDecorator
        implements CoffeeIngredient {

    public Sugar(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("Sugar");
        innerIngredient.showIngredient();
    }
}
