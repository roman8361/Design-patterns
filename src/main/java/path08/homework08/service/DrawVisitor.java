package path08.homework08.service;

import path08.homework08.api.Visitor;
import path08.homework08.entity.Diamond;
import path08.homework08.entity.Rectangle;
import path08.homework08.entity.Triangle;

public class DrawVisitor implements Visitor {

    private int x;

    private int y;

    public DrawVisitor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double visit(Rectangle rectangle) {
        try {
            System.out.println("Drawing rectangle in point (" + x + ", " + y + ")");
        } catch (Exception e) {
            return 1;
        }
        return 0;
    }

    @Override
    public double visit(Triangle triangle) {

        try {
            System.out.println("Drawing triangle in point (" + x + ", " + y + ")");
        } catch (Exception e) {
            return 1;
        }
        return 0;
    }

    @Override
    public double visit(Diamond diamond) {
        try {
            System.out.println("Drawing diamond in point (" + x + ", " + y + ")");
        } catch (Exception e) {
            return 1;
        }
        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
