package path06.lesson06.observer.auction.ex1;

/**
 * Observable.
 *
 * @author Ilya_Sukhachev
 */
public interface Observable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}
