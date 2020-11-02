package path06.lesson06.templatemethod.before;

import java.util.Random;

/**
 * RandomGame.
 *
 * @author Ilya_Sukhachev
 */
public class RandomGame {
    private Random random = new Random();
    private int count;
    private int totalResult;

    public void play() {
        count = random.nextInt(5);
        totalResult = count;
        System.out.println("Началась случайная игра");

        while (count > 0) {
            count--;
            System.out.println("Шаг случайной игры");
        }

        System.out.println("Игра окончена со счетом: " + totalResult);
    }
}
