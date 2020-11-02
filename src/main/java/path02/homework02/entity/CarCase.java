package path02.homework02.entity;

import java.awt.*;

public class CarCase {

    String nameCarCase;

    Color colorCarCase;

    String typeCarCase;

    public CarCase(String nameCarCase, Color colorCarCase, String typeCarCase) {
        this.nameCarCase = nameCarCase;
        this.colorCarCase = colorCarCase;
        this.typeCarCase = typeCarCase;
    }

    @Override
    public String toString() {
        return "CarCase{" +
                "nameCarCase='" + nameCarCase + '\'' +
                ", colorCarCase=" + colorCarCase +
                ", typeCarCase='" + typeCarCase + '\'' +
                '}';
    }

}
