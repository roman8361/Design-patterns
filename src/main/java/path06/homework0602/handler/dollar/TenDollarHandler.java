package path06.homework0602.handler.dollar;

import path06.homework0602.handler.CommonHandler;

public class TenDollarHandler extends DollarHandlerBase {

    protected int value = 10;

    public TenDollarHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}
