package path04.lesson04.decorator.calculator;

import java.util.function.Function;

/**
 * LoggerDecorator.
 *
 * @author Ilya_Sukhachev
 */
public class LoggerDecorator extends CalculatorDecoratorBase {

    public LoggerDecorator(ICalculator decoratee) {
        super(decoratee);
    }

    @Override
    public void setFunction(Function<Double, Double> func) {
        System.out.println("Function has been set ");
        super.setFunction(func);
    }

    @Override
    protected double onBeforeCalculate(double input) {
        System.out.printf("Computed started with argument: %.0f ", input);
        System.out.println();
        return super.onBeforeCalculate(input);
    }

    @Override
    protected double onAfterCalculate(double result) {
        System.out.printf("Computed finished with argument: %.0f ", result);
        System.out.println();
        return super.onAfterCalculate(result);
    }
}
