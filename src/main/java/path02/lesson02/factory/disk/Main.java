package path02.lesson02.factory.disk;


import path02.lesson02.factory.disk.samsung.SamsungFactory;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {

//        DiskFactory diskFactory = new WDFactory();
//        DiskFactory diskFactory = new IntelFactory();
        DiskFactory diskFactory = new SamsungFactory();

        M2 m2 = diskFactory.createM2();

        SSD ssd = diskFactory.createSsd();

        Hard hard = diskFactory.createHard();

    }
}
