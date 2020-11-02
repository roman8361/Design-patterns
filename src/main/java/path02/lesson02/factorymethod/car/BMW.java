package path02.lesson02.factorymethod.car;

/**
 * BMV.
 *
 * @author Ilya_Sukhachev
 */
public class BMW extends AbstractCar {

    protected BMW() {
    }

    @Override
    public void crash(Object context) {
        System.out.println("Продавай почку");
    }
}
