package path02.homework02.entity;

import java.awt.*;

public class Salon {

    String nameSalon;

    Color color;

    String material;

    public Salon(String nameSalon, Color color, String material) {
        this.nameSalon = nameSalon;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "nameSalon='" + nameSalon + '\'' +
                ", color=" + color.toString() +
                ", material='" + material.toString() + '\'' +
                '}';
    }

}
