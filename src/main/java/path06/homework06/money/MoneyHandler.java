package path06.homework06.money;

import path06.homework06.banknote.CurrencyType;

public abstract class MoneyHandler {

    private MoneyHandler nextHandler;

    protected MoneyHandler(MoneyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(CurrencyType currency, String banknote) {
        return nextHandler != null && nextHandler.validate(currency, banknote);
    }

}
