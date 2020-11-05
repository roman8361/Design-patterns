package path06.homework06.euro;

import path06.homework06.banknote.BanknoteHandler;

import static path06.homework06.Bancomat.getCash;
import static path06.homework06.Bancomat.setCash;

public class FiftyEuroHandler extends BanknoteHandler {

    private final int value;

    public FiftyEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.value = 50;
    }

    @Override
    public boolean validate(String banknote) {
        if (getCash() / this.value > 0) {
            System.out.println("Отдано " + (getCash() / this.value) + " банкнот " + this.value + " (евро)");
            setCash(getCash() % this.value);
        }
        return super.validate(banknote);
    }

}