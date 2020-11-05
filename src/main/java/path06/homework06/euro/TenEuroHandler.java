package path06.homework06.euro;

import path06.homework06.banknote.BanknoteHandler;

import static path06.homework06.Bancomat.getCash;

public class TenEuroHandler extends BanknoteHandler {

    private final int value;

    public TenEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.value = 10;
    }

    @Override
    public boolean validate(String banknote) {
        if (getCash() / this.value > 0) {
            System.out.println("Отдано " + (getCash() / this.value) + " банкнот " + this.value + " (евро)");
        }
        return super.validate(banknote);
    }
}