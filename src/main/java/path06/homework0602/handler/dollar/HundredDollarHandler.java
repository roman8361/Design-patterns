package path06.homework0602.handler.dollar;

import path06.homework0602.handler.CommonHandler;

public class HundredDollarHandler extends DollarHandlerBase {

    protected int value = 100;

    public HundredDollarHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}