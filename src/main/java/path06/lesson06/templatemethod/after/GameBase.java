package path06.lesson06.templatemethod.after;

/**
 * GameBase.
 *
 * @author Ilya_Sukhachev
 */
public abstract class GameBase {

    public void play() {
        initGame();
        while (!isGameOver()) {
            nextTurn();
        }
        System.out.println("Игра окончена со счетом: " + getTotalResult());
    }

    protected abstract void initGame();

    protected abstract boolean isGameOver();

    protected abstract void nextTurn();

    protected abstract int getTotalResult();
}
