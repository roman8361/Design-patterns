package path02.lesson02.factory.disk;

/**
 * DiskFactory.
 *
 * @author Ilya_Sukhachev
 */
public interface DiskFactory {

    Hard createHard();

    SSD createSsd();

    M2 createM2();
}
