package path08.homework08;

import path08.homework08.api.Figure;
import path08.homework08.entity.Diamond;
import path08.homework08.entity.Rectangle;
import path08.homework08.entity.Triangle;
import path08.homework08.service.ColorVisitor;
import path08.homework08.service.DrawVisitor;
import path08.homework08.service.PerimeterVisitor;
import path08.homework08.service.SquareVisitor;

public class App {

    public static void main(String[] args) {

        Figure diamond = new Diamond(102, 41);
        Figure triangle = new Triangle(53, 46);
        Figure rectangle = new Rectangle(21, 33);

        triangle.draw(new DrawVisitor(335,612));
        rectangle.draw(new DrawVisitor(223,123));
        diamond.draw(new DrawVisitor(1420,42));

        System.out.println("*********************");

        triangle.getSquare(new SquareVisitor());
        rectangle.getSquare(new SquareVisitor());
        diamond.getSquare(new SquareVisitor());
        System.out.println("*********************");

        rectangle.getPerimeter(new PerimeterVisitor());
        diamond.getPerimeter(new PerimeterVisitor());
        triangle.getPerimeter(new PerimeterVisitor());
        System.out.println("*********************");

        rectangle.coloring(new ColorVisitor("Red"));
        diamond.coloring(new ColorVisitor("Green"));
        triangle.coloring(new ColorVisitor("Blue"));
    }

}
