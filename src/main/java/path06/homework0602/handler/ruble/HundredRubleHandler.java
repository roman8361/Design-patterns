package path06.homework0602.handler.ruble;

import path06.homework0602.handler.CommonHandler;

public class HundredRubleHandler extends RubleHandlerBase {

    public HundredRubleHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 100;

    @Override
    protected int getValue() {
        return value;
    }

}
