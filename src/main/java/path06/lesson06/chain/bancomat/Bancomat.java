package path06.lesson06.chain.bancomat;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.FiftyDollarHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.HundredDollarHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.TenDollarHandler;
import ru.iteco.behavioral.chain.bancomat.ruble.TenRubleHandler;

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
