package path06.homework0602.handler.dollar;

import path06.homework0602.handler.CommonHandler;

public class FiftyDollarHandler extends DollarHandlerBase {

    protected int value = 50;

    public FiftyDollarHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}
