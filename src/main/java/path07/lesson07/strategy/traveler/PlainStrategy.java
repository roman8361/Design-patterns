package path07.lesson07.strategy.traveler;

/**
 * PlainStrategy.
 *
 * @author Ilya_Sukhachev
 */
public class PlainStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("I fly");
    }

}
