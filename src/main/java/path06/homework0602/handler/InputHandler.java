package path06.homework0602.handler;

import path06.homework0602.entity.CurrencyType;

import java.util.Arrays;

public class InputHandler extends CommonHandler {

    public InputHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(String banknote) {
        if (Arrays.stream(CurrencyType.values()).noneMatch(e-> e.name().equals(banknote.split(" ")[1]))) {
            throw new IllegalArgumentException("Incorrect currency type");
        }
        return super.validate(banknote);
    }

    @Override
    public String cash(String amount) {
        String[] arr = amount.split(" ");
        return this.cash(arr[0], arr[1], new StringBuilder());
    }

    @Override
    public String cash(String amount, String currency, StringBuilder cache) {
        if (Arrays.stream(CurrencyType.values()).noneMatch(e-> e.name().equals(currency))) {
           throw new IllegalArgumentException("Incorrect currency type");
        }
        if (CurrencyType.EUR.name().equals(currency) && Integer.parseInt(amount) > 10_000){
            throw new IllegalArgumentException("Мuch in EURO");
        }
        if (CurrencyType.USD.name().equals(currency) && Integer.parseInt(amount) > 20_000){
            throw new IllegalArgumentException("Мuch in USD");
        }
        if (CurrencyType.RUB.name().equals(currency) && Integer.parseInt(amount) > 100_000){
            throw new IllegalArgumentException("Much in RUB");
        }
        return super.cash(amount, currency, cache);
    }

}
