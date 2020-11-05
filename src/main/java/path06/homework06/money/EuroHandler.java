package path06.homework06.money;

import path06.homework06.banknote.BanknoteHandler;
import path06.homework06.banknote.CurrencyType;
import path06.homework06.euro.FiftyEuroHandler;
import path06.homework06.euro.TenEuroHandler;


public class EuroHandler extends MoneyHandler {
    private BanknoteHandler handler;

    public EuroHandler(MoneyHandler moneyHandler) {
        super(moneyHandler);
    }

    @Override
    public boolean validate(CurrencyType currency, String banknote) {
        if (currency.equals(CurrencyType.EUR)) {
            System.out.println("Выдаем евро");
            handler = new TenEuroHandler(null);
            handler = new FiftyEuroHandler(handler);
            handler.validate(banknote);
        }

        return super.validate(currency, banknote);
    }

}