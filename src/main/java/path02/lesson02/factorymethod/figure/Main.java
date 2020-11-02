package path02.lesson02.factorymethod.figure;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Figure circle = FigureFactory.getShape("circle");
        circle.getPerimeter();

        Figure rectangle = FigureFactory.getShape("rectangle");
        rectangle.getPerimeter();

        Figure square = FigureFactory.getShape("square");
        square.getPerimeter();
    }
}
