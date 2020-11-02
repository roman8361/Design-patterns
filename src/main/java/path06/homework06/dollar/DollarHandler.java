package path06.homework06.dollar;

import path06.homework06.banknote.BanknoteHandler;
import path06.homework06.banknote.CurrencyType;
import path06.homework06.handler.CurrencyHandler;

import static path06.homework06.Bancomat.getSum;

public class DollarHandler extends CurrencyHandler {

    private BanknoteHandler banknoteHandler;

    public DollarHandler(CurrencyHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(CurrencyType currency, String banknote) {
        if (currency.equals(CurrencyType.USD)) {
            System.out.println("DOLLARS");
            banknoteHandler = new TenDollarHandler(null);
            banknoteHandler = new FiftyDollarHandler(banknoteHandler);
            banknoteHandler = new HundredDollarHandler(banknoteHandler);
            banknoteHandler.validate(banknote);
            System.out.println("остаток " + getSum() + "usd");
        }

        return super.validate(currency, banknote);
    }
}
