package path04.lesson04.decorator.calculator;

import java.util.function.Function;

/**
 * CalculatorDecoratorBase.
 *
 * @author Ilya_Sukhachev
 */
public class CalculatorDecoratorBase implements ICalculator {

    protected ICalculator decoratee;

    public CalculatorDecoratorBase(ICalculator decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public void setFunction(Function<Double, Double> func) {
        decoratee.setFunction(func);
    }

    @Override
    public double calculate(Double input) {
        input = onBeforeCalculate(input);
        var result = decoratee.calculate(input);
        return onAfterCalculate(result);
    }

    protected double onBeforeCalculate(double input) {
        return input;
    }

    protected double onAfterCalculate(double result) {
        return result;
    }
}
