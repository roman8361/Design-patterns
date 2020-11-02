package path02.lesson02.factory.disk.samsung;


import path02.lesson02.factory.disk.DiskFactory;
import path02.lesson02.factory.disk.Hard;
import path02.lesson02.factory.disk.M2;
import path02.lesson02.factory.disk.SSD;

/**
 * SamsungFactory.
 *
 * @author Ilya_Sukhachev
 */
public class SamsungFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new SamsungHard();
    }

    @Override
    public SSD createSsd() {
        return new SamsungSSD();
    }

    @Override
    public M2 createM2() {
        return new SamsungM2();
    }
}
