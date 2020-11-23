package path06.homework0602.handler.ruble;

import path06.homework0602.handler.CommonHandler;

public class FiveThousandRubleHandler extends RubleHandlerBase {

    public FiveThousandRubleHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 5000;

    @Override
    protected int getValue() {
        return value;
    }

}
