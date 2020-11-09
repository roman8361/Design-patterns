package path07.lesson07.strategy.after;

import java.util.Random;

/**
 * RandomStrategy.
 *
 * @author Ilya_Sukhachev
 */
public class RandomStrategy implements GameStrategy {

    private Random random = new Random();
    private int count;
    private int totalResult;

    @Override
    public void initGame() {
        System.out.println("Началась случайная игра");
        count = random.nextInt(5);
        totalResult = count;
    }

    @Override
    public boolean isGameOver() {
        return count > 0;
    }

    @Override
    public void nextTurn() {
        count--;
        System.out.println("Шаг случайной игры");
    }

    @Override
    public int getTotalResult() {
        return totalResult;
    }
}
