package path06.lesson06.observer.lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * LessonObserver.
 *
 * @author Ilya_Sukhachev
 */
public class LessonObserver implements IObserver {

    private List<IObservable> observables;

    public LessonObserver() {
        this.observables = new ArrayList<>();
    }

    @Override
    public void attach(IObservable observable) {
        observables.add(observable);
        observable.setObserver(this);
    }

    @Override
    public void detach(IObservable observable) {
        observables.remove(observable);
        observable.setObserver(null);
    }

    @Override
    public void share(String message) {
        for (IObservable observable : observables) {
            observable.hear(message);
        }
    }

    public void ring() {
        share("ringing");
    }
}
