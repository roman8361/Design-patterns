package path08.homework08.api;

import path08.homework08.entity.Diamond;
import path08.homework08.entity.Rectangle;
import path08.homework08.entity.Triangle;

public interface Visitor {

    double visit(Rectangle rectangle);

    double visit(Triangle triangle);

    double visit(Diamond diamond);

}