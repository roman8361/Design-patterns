package path02.lesson02.factorymethod.figure;

/**
 * Square.
 *
 * @author Ilya_Sukhachev
 */
public class Square implements Figure {
    @Override
    public String getPerimeter() {
        return "4 * side";
    }
}
