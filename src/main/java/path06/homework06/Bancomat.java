package path06.homework06;


import path06.homework06.banknote.CurrencyType;
import path06.homework06.money.DollarHandler;
import path06.homework06.money.MoneyHandler;
import path06.homework06.money.RubleHandler;
import path06.homework06.money.EuroHandler;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {

    private MoneyHandler moneyHandler;

    private static Integer cash;

    public Bancomat() {
        moneyHandler = new RubleHandler(null);
        moneyHandler = new EuroHandler(moneyHandler);
        moneyHandler = new DollarHandler(moneyHandler);
    }

    public boolean validate(CurrencyType currency, String banknote) {
        setCash(Integer.parseInt(banknote));
        return !moneyHandler.validate(currency, banknote);
    }

    public static void setCash(int newCash) {
        cash = newCash;
    }

    public static int getCash() {
        return cash;
    }

}
