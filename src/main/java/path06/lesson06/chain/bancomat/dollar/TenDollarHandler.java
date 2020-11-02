package path06.lesson06.chain.bancomat.dollar;


import path06.lesson06.chain.bancomat.banknote.BanknoteHandler;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class TenDollarHandler extends DollarHandlerBase {

    protected int value = 10;

    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
