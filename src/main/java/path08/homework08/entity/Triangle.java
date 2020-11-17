package path08.homework08.entity;

import path08.homework08.service.ColorVisitor;
import path08.homework08.service.DrawVisitor;
import path08.homework08.service.PerimeterVisitor;
import path08.homework08.service.SquareVisitor;
import path08.homework08.api.Figure;

public class Triangle implements Figure {

    private int a;

    private double b;

    private double c;

    private int h;

    public Triangle() {
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
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
        System.out.println("Triangle square is : " + square);
    }

    @Override
    public void getPerimeter(PerimeterVisitor visitor) {
        double perimeter = visitor.visit(this);
        System.out.println("Triangle perimeter is : " + perimeter);
    }

    public int getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public int getH() {
        return h;
    }

}
