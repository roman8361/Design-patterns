package path07.lesson07.strategy.after;

/**
 * GameBase.
 *
 * @author Ilya_Sukhachev
 */
public abstract class Game {

    public void play(GameStrategy strategy) {
        strategy.initGame();
        while (!strategy.isGameOver()) {
            strategy.nextTurn();
        }
        System.out.println("Игра окончена со счетом: " + strategy.getTotalResult());
    }
}
