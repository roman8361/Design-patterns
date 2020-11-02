package path02.homework02.service;


import path02.homework02.api.CarFactory;
import path02.homework02.entity.TypeCar;

public class CarFactoryHelper {

    public static CarFactory create(TypeCar typeCar) {
        switch (typeCar) {
            case LADA:
                return new LadaFactory();
            case BMW:
                return new BmwFactory();
            case TOYOTA:
                return new ToyotaFactory();
            case SKODA:
                return new SkodaFactory();
            default:
                throw new RuntimeException("********");
        }
    }

}
