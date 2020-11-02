package path04.lesson04.decorator.coffeeshop;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Coffee coffee =
                new Coffee(
                        new Milk(
                                new Sugar(
                                        new Brandy(null)
                                )));
        coffee.showIngredient();
    }
}
