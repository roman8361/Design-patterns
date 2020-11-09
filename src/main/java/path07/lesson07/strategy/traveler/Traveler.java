package path07.lesson07.strategy.traveler;

/**
 * Traveler.
 *
 * @author Ilya_Sukhachev
 */
public class Traveler {

    private MovingStrategy currentStrategy;
    private int sum;
    private int timeLeft;
    private boolean isApocalypse;

    public Traveler(int sum, int timeLeft, boolean isApocalypse) {
        this.sum = sum;
        this.timeLeft = timeLeft;
        this.isApocalypse = isApocalypse;
    }

    private void defineStrategy() {
        if (isApocalypse) {
            currentStrategy = new HouseStrategy();
        }

        if (timeLeft < 8) {
            currentStrategy = new PlainStrategy();
        }

        if (sum < 10000) {
            currentStrategy = new TrainStrategy();
        } else {
            currentStrategy = new PlainStrategy();
        }
    }

    public void startTraveling() {
        defineStrategy();
        currentStrategy.move();
    }
}
