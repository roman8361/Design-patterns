package path02.lesson02.factorymethod.car;

/**
 * CarFactory.
 *
 * @author Ilya_Sukhachev
 */
public class CarFactory {

    public static AbstractCar createCar(String carName) {
        switch (carName) {
            case "Lada": return new Lada();
            default: return new BMW();
        }
    }
}
