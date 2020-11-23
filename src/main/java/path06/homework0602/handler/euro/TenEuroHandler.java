package path06.homework0602.handler.euro;

import path06.homework0602.handler.CommonHandler;

public class TenEuroHandler extends EuroHandlerBase {

    public TenEuroHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 10;

    @Override
    protected int getValue() {
        return value;
    }

}
