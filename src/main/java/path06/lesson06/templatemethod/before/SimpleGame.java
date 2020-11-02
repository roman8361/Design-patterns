package path06.lesson06.templatemethod.before;

/**
 * SimpleGame.
 *
 * @author Ilya_Sukhachev
 */
public class SimpleGame {
    private int count;

    public void play() {
        count = 3;
        System.out.println("Началась простая игра");
        while (count > 0) {
            count--;
            System.out.println("Шаг простой игры");
        }
        System.out.println("Игра окончена.");
    }
}