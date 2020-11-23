package path06.homework0602.handler.ruble;

import path06.homework0602.entity.CurrencyType;
import path06.homework0602.handler.BanknoteHandler;
import path06.homework0602.handler.CommonHandler;

public abstract class RubleHandlerBase extends BanknoteHandler {

    protected RubleHandlerBase(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected CurrencyType currencyType = CurrencyType.RUB;

    @Override
    protected CurrencyType getCurrency() {
        return currencyType;
    }

}
