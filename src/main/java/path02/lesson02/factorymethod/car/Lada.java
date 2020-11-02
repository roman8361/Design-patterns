package path02.lesson02.factorymethod.car;

/**
 * Lada.
 *
 * @author Ilya_Sukhachev
 */
public class Lada extends AbstractCar {

    protected Lada() {
    }

    @Override
    public void crash(Object context) {
        System.out.println("Я приехала!!!");
    }
}
