package path06.lesson06.observer.auction.ex2;

/**
 * Broker.
 *
 * @author Ilya_Sukhachev
 */
public class Broker implements Observer {

    private String name;

    public Broker(String name) {
        this.name = name;
    }

    @Override
    public void showMessage(String message) {
        System.out.printf("Broker %s received %s%n", name, message);
    }
}
