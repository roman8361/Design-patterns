package path08.homework08.service;

import path08.homework08.api.Visitor;
import path08.homework08.entity.Diamond;
import path08.homework08.entity.Rectangle;
import path08.homework08.entity.Triangle;

public class ColorVisitor implements Visitor {

    private String color;

    public ColorVisitor(String color) {
        this.color = color;
    }

    @Override
    public double visit(Rectangle rectangle) {
        System.out.println("Set " + color + " color to rectangle");
        return 0;
    }

    @Override
    public double visit(Triangle triangle) {
        System.out.println("Set " + color + " color to triangle");
        return 0;
    }

    @Override
    public double visit(Diamond diamond) {
        System.out.println("Set " + color + " color to diamond");
        return 0;
    }

}
