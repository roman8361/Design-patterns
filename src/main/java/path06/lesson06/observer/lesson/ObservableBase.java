package path06.lesson06.observer.lesson;

/**
 * ObservableBase.
 *
 * @author Ilya_Sukhachev
 */
public abstract class ObservableBase extends IObservable {

    protected String name;

    public ObservableBase(String name) {
        this.name = name;
    }

    @Override
    public void say(String message) {
        System.out.println(name + " said " + message);
        observer.share(message);
    }

    public abstract void hear(String message);
}
