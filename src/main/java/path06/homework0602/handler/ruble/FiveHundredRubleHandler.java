package path06.homework0602.handler.ruble;

import path06.homework0602.handler.CommonHandler;

public class FiveHundredRubleHandler extends RubleHandlerBase {

    public FiveHundredRubleHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 500;

    @Override
    protected int getValue() {
        return value;
    }

}
