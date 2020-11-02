package path06.homework06;


import path06.homework06.banknote.BanknoteHandler;
import path06.homework06.banknote.CurrencyType;
import path06.homework06.dollar.DollarHandler;
import path06.homework06.dollar.FiftyDollarHandler;
import path06.homework06.dollar.HundredDollarHandler;
import path06.homework06.dollar.TenDollarHandler;
import path06.homework06.handler.CurrencyHandler;
import path06.homework06.ruble.TenRubleHandler;
import path06.lesson06.chain.bancomat.dollar.DollarHandlerBase;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {

    private CurrencyHandler currencyHandler;

    private static int sum;

    public Bancomat() {
        currencyHandler = new DollarHandler(null);

//        handler = new TenRubleHandler(null);
//        handler = new TenDollarHandler(handler);
//        handler = new FiftyDollarHandler(handler);
//        handler = new HundredDollarHandler(handler);
    }

    public boolean validate(CurrencyType currency, String banknote) {
        setSum(Integer.parseInt(banknote));
        return currencyHandler.validate(currency, banknote);
    }

    public static void setSum(int newValue) {
        sum = newValue;
    }

    public static int getSum() {
        return sum;
    }

}
