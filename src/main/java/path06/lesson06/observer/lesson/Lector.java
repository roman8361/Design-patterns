package path06.lesson06.observer.lesson;

/**
 * Lector.
 *
 * @author Ilya_Sukhachev
 */
public class Lector extends ObservableBase {
    public Lector(String name) {
        super(name);
    }

    @Override
    public void hear(String message) {
        System.out.println(name + " heared " + message);

        if (message.endsWith("!")) {
            say("SHUT UP");
        }

        if (message.endsWith("?")) {
            say("answer");
        }
    }
}
