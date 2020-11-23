package path06.homework0602.handler.euro;

import path06.homework0602.entity.CurrencyType;
import path06.homework0602.handler.BanknoteHandler;
import path06.homework0602.handler.CommonHandler;

public abstract class EuroHandlerBase extends BanknoteHandler {

    protected EuroHandlerBase(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected CurrencyType currencyType = CurrencyType.EUR;

    @Override
    protected CurrencyType getCurrency() {
        return currencyType;
    }

}
