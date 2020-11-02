package path02.lesson02.singleton.synch;

/**
 * Single.
 * Жадный так synchronized мы тратим много ресурсов на обращение getInstance. Дорагая реалиазация
 * + Ленивая инициализация
 * - Низкая производительность
 * @author Ilya_Sukhachev
 */
public class Single {

    private static Single instance;

    private Single() {
    }

    public static synchronized Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }

}
