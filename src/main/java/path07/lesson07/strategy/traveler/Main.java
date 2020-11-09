package path07.lesson07.strategy.traveler;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Traveler traveler = new Traveler(0, 5, false);

        Traveler travelerTwo = new Traveler(20_000, 15, false);

        Traveler travelerThree = new Traveler(100_000, 15, true);

        traveler.startTraveling();
        travelerTwo.startTraveling();
        travelerThree.startTraveling();
    }
}
