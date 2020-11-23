package path06.homework0602.handler.ruble;

import path06.homework0602.handler.CommonHandler;

public class ThousandRubleHandler extends RubleHandlerBase {

    public ThousandRubleHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 1000;

    @Override
    protected int getValue() {
        return value;
    }

}
