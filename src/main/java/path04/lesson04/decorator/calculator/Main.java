package path04.lesson04.decorator.calculator;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        //Пустой калькулятор, без дополнительной логики
        ICalculator calculator = new Calculator();

        //Калькулятор задекорированный логером и таймером
//        calculator = new TimerDecorator(calculator);
//        calculator = new LoggerDecorator(calculator);

        //Пример билдера раширения для удобного составления цепочки дерорторов
        calculator = new DecoratorBuilder(calculator)
                .withTimer()
                .withLogger()
                .build();

        calculator.setFunction(aDouble -> aDouble * 2);
        var result = calculator.calculate(2.0);
        System.out.println(result);
    }
}
