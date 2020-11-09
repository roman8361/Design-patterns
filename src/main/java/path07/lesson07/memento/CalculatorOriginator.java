package path07.lesson07.memento;

/**
 * CalculatorOrdinator.
 *
 * @author Ilya_Sukhachev
 */
public class CalculatorOriginator {

    private class CalculatorMemento implements Memento {

        private int result;
        private CalculatorOriginator ordinator;

        public CalculatorMemento(CalculatorOriginator ordinator, int state) {
            result = state;
            this.ordinator = ordinator;
        }

        public void restore() {
            ordinator.result = result;
        }
    }

    private int result;

    public void add(int operand) {
        result += operand;
    }

    public Memento getMemento() {
        return new CalculatorMemento(this, result);
    }

    public int getResult() {
        return result;
    }
}
