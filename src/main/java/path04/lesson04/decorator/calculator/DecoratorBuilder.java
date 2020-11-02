package path04.lesson04.decorator.calculator;

/**
 * DecoratorBuilder.
 *
 * @author Ilya_Sukhachev
 */
public class DecoratorBuilder {

    private ICalculator calculator;

    public DecoratorBuilder(ICalculator calculator) {
        this.calculator = calculator;
    }

    public DecoratorBuilder withTimer() {
        calculator = new TimerDecorator(calculator);
        return this;
    }

    public DecoratorBuilder withLogger() {
        calculator = new LoggerDecorator(calculator);
        return this;
    }

    public ICalculator build() {
        return calculator;
    }
}
