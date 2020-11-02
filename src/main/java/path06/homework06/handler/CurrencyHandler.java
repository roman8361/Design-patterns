package path06.homework06.handler;

import path06.homework06.banknote.CurrencyType;

public abstract class CurrencyHandler {

    private final CurrencyHandler nextHandler;

    protected CurrencyHandler(CurrencyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(CurrencyType currency, String banknote) {
        return nextHandler != null && nextHandler.validate(currency, banknote);
    }

}
