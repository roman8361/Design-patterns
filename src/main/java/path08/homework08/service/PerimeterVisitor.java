package path08.homework08.service;

import path08.homework08.api.Visitor;
import path08.homework08.entity.Diamond;
import path08.homework08.entity.Rectangle;
import path08.homework08.entity.Triangle;

public class PerimeterVisitor implements Visitor {

    public PerimeterVisitor() {
    }

    @Override
    public double visit(Rectangle rectangle) {
        return 2 * (rectangle.getA() + rectangle.getB());
    }

    @Override
    public double visit(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    @Override
    public double visit(Diamond diamond) {
        return 4 * Math.sqrt(0.25 * diamond.getH1() * diamond.getH1() + 0.25 * diamond.getH2() *diamond.getH2());
    }

}
