package path08.homework08.service;

import path08.homework08.api.Visitor;
import path08.homework08.entity.Diamond;
import path08.homework08.entity.Rectangle;
import path08.homework08.entity.Triangle;

public class SquareVisitor implements Visitor {

    public SquareVisitor() {
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    @Override
    public double visit(Triangle triangle) {
        return 0.5 * triangle.getA() * triangle.getH();
    }

    @Override
    public double visit(Diamond diamond) {
        return diamond.getH1() * diamond.getH2();
    }

}