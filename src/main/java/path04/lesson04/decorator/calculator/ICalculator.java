package path04.lesson04.decorator.calculator;

import java.util.function.Function;

/**
 * ICalculator.
 *
 * @author Ilya_Sukhachev
 */
public interface ICalculator {

    void setFunction(Function<Double, Double> func);

    double calculate(Double input);
}
