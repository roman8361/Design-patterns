package path08.homework08.api;

import path08.homework08.service.ColorVisitor;
import path08.homework08.service.DrawVisitor;
import path08.homework08.service.PerimeterVisitor;
import path08.homework08.service.SquareVisitor;

public interface Figure {

    void getSquare(SquareVisitor visitor);

    void getPerimeter(PerimeterVisitor visitor);

    void draw(DrawVisitor visitor);

    void coloring(ColorVisitor visitor);

}
