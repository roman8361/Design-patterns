package path06.homework06.ruble;

import path06.homework06.banknote.BanknoteHandler;

public class FiftyRubleHandler extends BanknoteHandler {

    protected int value = 50;

    protected FiftyRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(String banknote) {
//        if (getSum() / this.value > 0) {
//            System.out.println("Выдано " + (getSum() / this.value) +
//                    " купюр достоинством " + this.value +
//                    " (рублей)");
//            setSum(getSum() % this.value);
//        }
        return super.validate(banknote);
    }

}
