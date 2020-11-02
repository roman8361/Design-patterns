package path06.lesson06.observer.auction.ex1;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Broker john = new Broker("John");
        Broker yan = new Broker("Yan");
        Broker henry = new Broker("Henry");
        Broker adam = new Broker("Adam");

        Auction forex = new Auction("forex");
        Auction alpary = new Auction("alpary");

        forex.registerObserver(john);
        forex.registerObserver(yan);
        forex.registerObserver(henry);

        alpary.registerObserver(yan);
        alpary.registerObserver(adam);


        forex.notifyAllObservers();
        alpary.notifyAllObservers();
    }
}
