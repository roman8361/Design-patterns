package path06.homework0602;

import path06.homework0602.handler.CommonHandler;
import path06.homework0602.handler.InputHandler;
import path06.homework0602.handler.OutputHandler;
import path06.homework0602.handler.dollar.FiftyDollarHandler;
import path06.homework0602.handler.dollar.HundredDollarHandler;
import path06.homework0602.handler.dollar.TenDollarHandler;
import path06.homework0602.handler.euro.FiftyEuroHandler;
import path06.homework0602.handler.euro.FiveHundredEuroHandler;
import path06.homework0602.handler.euro.HundredEuroHandler;
import path06.homework0602.handler.euro.TenEuroHandler;
import path06.homework0602.handler.ruble.FiveHundredRubleHandler;
import path06.homework0602.handler.ruble.FiveThousandRubleHandler;
import path06.homework0602.handler.ruble.HundredRubleHandler;
import path06.homework0602.handler.ruble.ThousandRubleHandler;

public class Bancomat {

    private CommonHandler handler;

    public Bancomat() {
        handler = new OutputHandler(null);

        handler = new HundredRubleHandler(handler);
        handler = new FiveHundredRubleHandler(handler);
        handler = new ThousandRubleHandler(handler);
        handler = new FiveThousandRubleHandler(handler);

        handler = new TenDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);

        handler = new TenEuroHandler(handler);
        handler = new FiftyEuroHandler(handler);
        handler = new HundredEuroHandler(handler);
        handler = new FiveHundredEuroHandler(handler);

        handler = new InputHandler(handler);
    }

    public boolean validate(String banknote) {
        return handler.validate(banknote);
    }

    public String getCash(String amount) {
        return handler.cash(amount);
    }

}