package path02.lesson02.factorymethod;

import path02.lesson02.factorymethod.car.AbstractCar;
import path02.lesson02.factorymethod.car.CarFactory;


/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
//        Lada lada = new Lada();

//        AbstractCar[] cars = { new Lada(), new BMW()};
        AbstractCar[] cars = { CarFactory.createCar("Lada"),
                CarFactory.createCar("") };
        for (AbstractCar car : cars) {
            car.crash(null);
        }
    }
}
