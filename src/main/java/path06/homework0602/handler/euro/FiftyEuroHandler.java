package path06.homework0602.handler.euro;

import path06.homework0602.handler.CommonHandler;

public class FiftyEuroHandler extends EuroHandlerBase {

    protected int value = 50;

    public FiftyEuroHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}