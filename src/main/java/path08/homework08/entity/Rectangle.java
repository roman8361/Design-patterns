package path08.homework08.entity;

import path08.homework08.service.ColorVisitor;
import path08.homework08.service.DrawVisitor;
import path08.homework08.service.PerimeterVisitor;
import path08.homework08.service.SquareVisitor;
import path08.homework08.api.Figure;

public class Rectangle implements Figure {

    private int a;

    private int b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw(DrawVisitor visitor) {
        double status = visitor.visit(this);
        System.out.println("Drawing rectangle finished with status: " + status);
    }

    @Override
    public void coloring(ColorVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void getSquare(SquareVisitor visitor) {
        double square = visitor.visit(this);
        System.out.println("Rectangle square is : " + square);
    }

    @Override
    public void getPerimeter(PerimeterVisitor visitor) {
        double perimeter = visitor.visit(this);
        System.out.println("Rectangle perimeter is : " + perimeter);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}