package path08.homework08.entity;

import path08.homework08.service.ColorVisitor;
import path08.homework08.service.DrawVisitor;
import path08.homework08.service.PerimeterVisitor;
import path08.homework08.service.SquareVisitor;
import path08.homework08.api.Figure;

public class Diamond implements Figure {

    private int h1;

    private int h2;

    public Diamond() {
    }

    public Diamond(int h1, int h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void draw(DrawVisitor visitor) {
        double status = visitor.visit(this);
        System.out.println("Drawing diamond finished with status: " + status);
    }

    @Override
    public void coloring(ColorVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void getSquare(SquareVisitor visitor) {
        double square = visitor.visit(this);
        System.out.println("Diamond square is : " + square);
    }

    @Override
    public void getPerimeter(PerimeterVisitor visitor) {
        double perimeter = visitor.visit(this);
        System.out.println("Diamod perimeter is : " + perimeter);
    }

    public int getH1() {
        return h1;
    }

    public int getH2() {
        return h2;
    }

}
