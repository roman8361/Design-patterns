package path02.lesson02.factory.disk.wd;


import path02.lesson02.factory.disk.DiskFactory;
import path02.lesson02.factory.disk.Hard;
import path02.lesson02.factory.disk.M2;
import path02.lesson02.factory.disk.SSD;

/**
 * WDFactory.
 *
 * @author Ilya_Sukhachev
 */
public class WDFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new WDHard();
    }

    @Override
    public SSD createSsd() {
        return new WDSSD();
    }

    @Override
    public M2 createM2() {
        return new WDM2();
    }
}
