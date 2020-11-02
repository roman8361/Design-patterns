package path06.lesson06.observer.lesson;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        var observer = new LessonObserver();

        var student1 = new Student("Adam");
        var student2 = new Student("Peter");
        var student3 = new Student("Max");

        var lector = new Lector("Prof. Smith");

        observer.attach(student1);
        observer.attach(student2);
        observer.attach(student3);
        observer.attach(lector);

        student1.say("something");
        System.out.println();

        student2.say("some noize!");
        System.out.println();

        observer.detach(student1);
        student3.say("question?");
        System.out.println();

        System.out.println("Ring");
        observer.ring();
        System.out.println();
    }
}
