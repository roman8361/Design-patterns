package path06.homework06.ruble;

import path06.homework06.banknote.BanknoteHandler;

import static path06.homework06.Bancomat.getCash;

public class ThousandRubleHandler extends BanknoteHandler {
    private int value;

    public ThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.value = 1000;
    }

    @Override
    public boolean validate(String banknote) {
        if (getCash() / this.value > 0) {
            System.out.println("Отдано " + (getCash() / this.value) + " банкнот " + this.value + " (рублей)");
        }

        return super.validate(banknote);
    }

}
