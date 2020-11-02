package path06.homework06.dollar;


import path06.homework06.banknote.BanknoteHandler;


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

    protected int getValue() {
        return value;
    }

}
