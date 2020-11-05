package path06.homework06.money;

import path06.homework06.banknote.BanknoteHandler;
import path06.homework06.banknote.CurrencyType;
import path06.homework06.dollar.FiftyDollarHandler;
import path06.homework06.dollar.HundredDollarHandler;
import path06.homework06.dollar.TenDollarHandler;

public class DollarHandler extends MoneyHandler {

    private BanknoteHandler handler;

    public DollarHandler(MoneyHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(CurrencyType currency, String banknote) {
        if (currency.equals(CurrencyType.USD)) {
            System.out.println("CurrencyType.USD");
            handler = new TenDollarHandler(null);
            handler = new FiftyDollarHandler(handler);
            handler = new HundredDollarHandler(handler);
            handler.validate(banknote);
        }
        return super.validate(currency, banknote);
    }
}
