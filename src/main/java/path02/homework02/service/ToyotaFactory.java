package path02.homework02.service;


import car.api.CarFactory;
import car.entity.*;

import java.awt.*;

public class ToyotaFactory implements CarFactory {

    @Override
    public CarCase createCarCase() {
        return new CarCase("Camry", Color.WHITE, TypeCarCase.SEDAN.name());
    }

    @Override
    public Salon createSalon() {
        return new Salon("Таксёр с пулково", Color.BLACK, "дешёвая кожа (скорее всего свинная)");
    }

    @Override
    public Motor createMotor() {
        return new Motor("154 лс", TypeMotor.OIL.name());
    }

}
