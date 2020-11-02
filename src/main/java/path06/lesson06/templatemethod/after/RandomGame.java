package path06.lesson06.templatemethod.after;

import java.util.Random;

/**
 * RandomGame.
 *
 * @author Ilya_Sukhachev
 */
public class RandomGame extends GameBase {

    private Random random = new Random();
    private int count;
    private int totalResult;

    @Override
    protected void initGame() {
        System.out.println("Началась случайная игра");
        count = random.nextInt(5);
        totalResult = count;
    }

    @Override
    protected boolean isGameOver() {
        return count > 0;
    }

    @Override
    protected void nextTurn() {
        count--;
        System.out.println("Шаг случайной игры");
    }

    @Override
    protected int getTotalResult() {
        return totalResult;
    }
}
