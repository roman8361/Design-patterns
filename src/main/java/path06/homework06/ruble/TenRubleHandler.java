package path06.homework06.ruble;


import path06.homework06.banknote.BanknoteHandler;

import static path06.homework06.Bancomat.getCash;
import static path06.homework06.Bancomat.setCash;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public class TenRubleHandler extends BanknoteHandler {
    private final int value;

    public TenRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.value = 10;
    }

    @Override
    public boolean validate(String banknote) {
        if (getCash() / this.value > 0) {
            System.out.println("Отдано " + (getCash() / this.value) + " банкнот " + this.value + " (рублей)");
            setCash(getCash() % this.value);
        }

        return super.validate(banknote);
    }

}
