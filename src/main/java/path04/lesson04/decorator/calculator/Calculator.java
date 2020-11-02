package path04.lesson04.decorator.calculator;

import java.util.function.Function;

/**
 * Calcuator.
 *
 * @author Ilya_Sukhachev
 */
public class Calculator implements ICalculator {

    private Function<Double, Double> function;

    @Override
    public void setFunction(Function<Double, Double> function) {
        this.function = function;
    }

    @Override
    public double calculate(Double input) {
        return function.apply(input);
    }
}
