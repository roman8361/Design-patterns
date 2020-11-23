package path06.homework0602.handler.euro;

import path06.homework0602.handler.CommonHandler;

public class FiveHundredEuroHandler extends EuroHandlerBase {

    protected int value = 500;

    public FiveHundredEuroHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}