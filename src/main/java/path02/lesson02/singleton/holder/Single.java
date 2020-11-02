package path02.lesson02.singleton.holder;

/**
 * Single.
 * + Ленивая инициализация
 * + Высокая производительность
 * - Невозможно использовать для не статических полей класса
 * @author Ilya_Sukhachev
 */
public class Single {

    private Single() {
    }

    static class Holder {
        public static Single instance = new Single();
    }

    public static Single getInstance() {
        return Holder.instance;
    }
}
