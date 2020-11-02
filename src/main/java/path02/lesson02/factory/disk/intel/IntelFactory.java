package path02.lesson02.factory.disk.intel;


import path02.lesson02.factory.disk.DiskFactory;
import path02.lesson02.factory.disk.Hard;
import path02.lesson02.factory.disk.M2;
import path02.lesson02.factory.disk.SSD;

/**
 * WDFactory.
 *
 * @author Ilya_Sukhachev
 */
public class IntelFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new IntelHard();
    }

    @Override
    public SSD createSsd() {
        return new IntelSSD();
    }

    @Override
    public M2 createM2() {
        return new IntelM2();
    }
}
