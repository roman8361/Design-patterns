package path06.lesson06.observer.lesson;

/**
 * Student.
 *
 * @author Ilya_Sukhachev
 */
public class Student extends ObservableBase {

    public Student(String name) {
        super(name);
    }

    @Override
    public void hear(String message) {
        System.out.println(name + " heared " + message);
    }
}
