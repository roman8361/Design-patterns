package path06.lesson06.chain.bancomat;


import path06.lesson06.chain.bancomat.banknote.BanknoteHandler;
import path06.lesson06.chain.bancomat.dollar.FiftyDollarHandler;
import path06.lesson06.chain.bancomat.dollar.HundredDollarHandler;
import path06.lesson06.chain.bancomat.dollar.TenDollarHandler;
import path06.lesson06.chain.bancomat.ruble.TenRubleHandler;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        handler = new TenRubleHandler(null);
        handler = new TenDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
    }

    public boolean validate(String banknote) {
        return handler.validate(banknote);
    }

}
