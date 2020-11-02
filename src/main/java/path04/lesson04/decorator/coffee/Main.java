package path04.lesson04.decorator.coffee;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee(new Milk());
        coffee.showIngredient();
    }
}
