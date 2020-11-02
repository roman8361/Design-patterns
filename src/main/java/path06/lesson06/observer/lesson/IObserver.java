package path06.lesson06.observer.lesson;

/**
 * IObserver.
 *
 * @author Ilya_Sukhachev
 */
public interface IObserver {

    void attach(IObservable observable);

    void detach(IObservable observable);

    void share(String message);

}
