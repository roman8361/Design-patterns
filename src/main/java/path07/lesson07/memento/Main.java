package path07.lesson07.memento;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        mementoCaretakerExample();
    }

    private static void mementoCaretakerExample() {
        var originator = new CalculatorOriginator();
        var memento0 = originator.getMemento();

        originator.add(100);
        originator.add(333);

        System.out.println(originator.getResult());
        var memento443 = originator.getMemento();

        memento0.restore();
        System.out.println(originator.getResult());
        memento443.restore();
        System.out.println(originator.getResult());
    }
}
