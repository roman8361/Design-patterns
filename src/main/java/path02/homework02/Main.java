package path02.homework02;


import path02.homework02.api.CarFactory;
import path02.homework02.entity.TypeCar;
import path02.homework02.service.CarFactoryHelper;

public class Main {

    public static void main(String[] args) {
        createCar(TypeCar.LADA);
        System.out.println("#########");
        createCar(TypeCar.BMW);
        System.out.println("#########");
        createCar(TypeCar.TOYOTA);
        System.out.println("#########");
        createCar(TypeCar.SKODA);
    }


    private static void createCar(TypeCar typeCar) {
        var factory = CarFactoryHelper.create(typeCar);
        printCat(factory);
    }

    private static void printCat(CarFactory carFactory) {
        var salon = carFactory.createSalon();
        var carCase = carFactory.createCarCase();
        var typeMotor = carFactory.createMotor();

        System.out.println(salon);
        System.out.println(carCase);
        System.out.println(typeMotor);
    }

}
