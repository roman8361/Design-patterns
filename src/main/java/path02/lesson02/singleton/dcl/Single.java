package path02.lesson02.singleton.dcl;

/**
 * Single.
 *
 * + Ленивая инициализация
 * + Высокая производительность
 * - Поддерживается только с JDK 1.5
 * Double Checked Lock можно использовать без исключений с immutable объектами (String, Integer, Float, и т.д.).
 * @author Ilya_Sukhachev
 */
public class Single {

    private static volatile Single instance;

    private Single() {
    }

    public static Single getInstance() {
        if (instance == null) {
//            synchronized (instance) {
            synchronized (Single.class) {
                if (instance == null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}
