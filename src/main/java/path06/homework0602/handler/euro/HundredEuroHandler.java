package path06.homework0602.handler.euro;

import path06.homework0602.handler.CommonHandler;

public class HundredEuroHandler extends EuroHandlerBase {

    protected int value = 100;

    public HundredEuroHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}