package path04.lesson04.decorator.coffee;

/**
 * Sugar.
 *
 * @author Ilya_Sukhachev
 */
public class Sugar implements CoffeeIngredient {


    @Override
    public void showIngredient() {
        System.out.println("Sugar");
    }
}
