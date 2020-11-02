package path02.lesson02.factorymethod.figure;

/**
 * FigureFactory.
 *
 * @author Ilya_Sukhachev
 */
public class FigureFactory {

    static Figure getShape(String figureType) {

        switch (figureType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
