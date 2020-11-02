package path04.lesson04.decorator.calculator;

/**
 * TimerDecorator.
 *
 * @author Ilya_Sukhachev
 */
public class TimerDecorator extends CalculatorDecoratorBase {

    private long watch;

    public TimerDecorator(ICalculator decoratee) {
        super(decoratee);
    }

    protected double onBeforeCalculate(double input) {
        watch = System.currentTimeMillis();
        return super.onBeforeCalculate(input);
    }

    protected double onAfterCalculate(double result) {
        System.out.printf("Compulation complete: %s ms", System.currentTimeMillis() - watch);
        System.out.println();
        return super.onAfterCalculate(result);
    }
}
