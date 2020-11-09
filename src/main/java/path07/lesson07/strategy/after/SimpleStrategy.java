package path07.lesson07.strategy.after;

/**
 * SimpleStrategy.
 *
 * @author Ilya_Sukhachev
 */
public class SimpleStrategy implements GameStrategy {

    private int count;

    @Override
    public void initGame() {
        count = 3;
        System.out.println("Началась простая игра");
    }

    @Override
    public boolean isGameOver() {
        return count > 0;
    }

    @Override
    public void nextTurn() {
        count--;
        System.out.println("Шаг простой игры");
    }

    @Override
    public int getTotalResult() {
        return 3;
    }
}
