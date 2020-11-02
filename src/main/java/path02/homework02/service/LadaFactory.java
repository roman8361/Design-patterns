package path02.homework02.service;


import path02.homework02.api.CarFactory;
import path02.homework02.entity.*;

import java.awt.*;

public class LadaFactory implements CarFactory {

    @Override
    public CarCase createCarCase() {
        return new CarCase("ВАЗ 2108", Color.RED, TypeCarCase.HATCHBACK.name());
    }

    @Override
    public Salon createSalon() {
        return new Salon("Пацан мобиль", Color.YELLOW, "Велюр");
    }

    @Override
    public Motor createMotor() {
        return new Motor("86 лс", TypeMotor.OIL.name());
    }

}
