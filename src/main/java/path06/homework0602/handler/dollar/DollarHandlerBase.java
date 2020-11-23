package path06.homework0602.handler.dollar;

import path06.homework0602.entity.CurrencyType;
import path06.homework0602.handler.BanknoteHandler;
import path06.homework0602.handler.CommonHandler;

public abstract class DollarHandlerBase extends BanknoteHandler {

    protected DollarHandlerBase(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected CurrencyType currencyType = CurrencyType.USD;

    @Override
    protected CurrencyType getCurrency() {
        return currencyType;
    }

}
