package path02.homework02.service;


import path02.homework02.api.CarFactory;
import path02.homework02.entity.*;

import java.awt.*;

public class SkodaFactory implements CarFactory {

    @Override
    public CarCase createCarCase() {
        return new CarCase("Octavia", Color.GRAY, TypeCarCase.HATCHBACK.name());
    }

    @Override
    public Salon createSalon() {
        return new Salon("Скромный семьянин", Color.GRAY, "ткань");
    }

    @Override
    public Motor createMotor() {
        return new Motor("106 лс", TypeMotor.OIL.name());
    }

}
