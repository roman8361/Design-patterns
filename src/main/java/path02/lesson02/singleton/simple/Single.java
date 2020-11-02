package path02.lesson02.singleton.simple;

/**
 * Single.
 *
 * @author Ilya_Sukhachev
 */
public class Single {

    private static Single instance;

    private Single() {
    }

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}
