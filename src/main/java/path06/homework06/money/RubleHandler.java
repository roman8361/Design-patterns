package path06.homework06.money;

import path06.homework06.banknote.BanknoteHandler;
import path06.homework06.banknote.CurrencyType;
import path06.homework06.ruble.FiftyRubleHandler;
import path06.homework06.ruble.HundredRubleHandler;
import path06.homework06.ruble.TenRubleHandler;
import path06.homework06.ruble.ThousandRubleHandler;


public class RubleHandler extends MoneyHandler {

    private BanknoteHandler handler;

    public RubleHandler(MoneyHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(CurrencyType currency, String banknote) {
        if (currency.equals(CurrencyType.RUB)) {
            System.out.println("Получите рубли");
            handler = new TenRubleHandler(null);
            handler = new FiftyRubleHandler(handler);
            handler = new HundredRubleHandler(handler);
            handler = new ThousandRubleHandler(handler);
            handler.validate(banknote);
        }

        return super.validate(currency, banknote);
    }

}