package path06.lesson06.templatemethod.after;

/**
 * SimpleGame.
 *
 * @author Ilya_Sukhachev
 */
public class SimpleGame extends GameBase {

    private int count;

    @Override
    protected void initGame() {
        count = 3;
        System.out.println("Началась простая игра");
    }

    @Override
    protected boolean isGameOver() {
        return count > 0;
    }

    @Override
    protected void nextTurn() {
        count--;
        System.out.println("Шаг простой игры");
    }

    @Override
    protected int getTotalResult() {
        return 3;
    }
}
