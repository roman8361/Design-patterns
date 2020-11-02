package path02.lesson02.singleton.greedy;

/**
 * Single.
 *
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 * @author Ilya_Sukhachev
 */
public class Single {

    private static final Single instance = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return instance;
    }
}
