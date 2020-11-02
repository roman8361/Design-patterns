package path02.homework02.service;


import path02.homework02.api.CarFactory;
import path02.homework02.entity.*;

import java.awt.*;

public class BmwFactory implements CarFactory {

    @Override
    public CarCase createCarCase() {
        return new CarCase("BMW 730", Color.BLACK, TypeCarCase.SEDAN.name());
    }

    @Override
    public Salon createSalon() {
        return new Salon("Черный боров", Color.BLACK, "Кожа-рожа");
    }

    @Override
    public Motor createMotor() {
        return new Motor("289 лс", TypeMotor.DIESEL.name());
    }

}
