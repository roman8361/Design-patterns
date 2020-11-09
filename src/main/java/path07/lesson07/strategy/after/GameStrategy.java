package path07.lesson07.strategy.after;

/**
 * GameStrategy.
 *
 * @author Ilya_Sukhachev
 */
public interface GameStrategy {

    void initGame();

    boolean isGameOver();

    void nextTurn();

    int getTotalResult();
}
