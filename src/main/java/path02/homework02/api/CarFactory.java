package path02.homework02.api;


import path02.homework02.entity.CarCase;
import path02.homework02.entity.Motor;
import path02.homework02.entity.Salon;

public interface CarFactory {

    public CarCase createCarCase();

    Salon createSalon();

    Motor createMotor();

}
