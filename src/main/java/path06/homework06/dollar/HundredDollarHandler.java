package path06.homework06.dollar;


import path06.homework06.banknote.BanknoteHandler;
import path06.homework06.banknote.CurrencyType;

import static path06.homework06.Bancomat.getCash;


/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class HundredDollarHandler extends BanknoteHandler {

    protected int value = 100;

    public HundredDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    public boolean validate(CurrencyType currency, String banknote) {
        if (getCash() / this.value > 0) {
            return true;
        }
        return super.validate(banknote);
    }

    protected int getValue() {
        return value;
    }

}
