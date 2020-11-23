package path06.homework0602.handler;

import path06.homework0602.entity.CurrencyType;

public abstract class BanknoteHandler extends CommonHandler {

    protected BanknoteHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    protected abstract int getValue();

    protected abstract CurrencyType getCurrency();

    @Override
    public boolean validate(String banknote) {
        String value = banknote.split(" ")[0];
        String currency = banknote.split(" ")[1];
        if (value.equals(String.valueOf(getValue()))
                && getCurrency().name().equals(currency)) {
            return true;
        }
        return super.validate(banknote);
    }

    @Override
    public String cash(String amount, String currency, StringBuilder cache) {
        int amountResult = Integer.parseInt(amount);
        if (amountResult != 0 && getCurrency().name().equals(currency)) {
            int count = amountResult / getValue();
            amountResult = amountResult % getValue();
            if (count != 0) {
                cache.append(getValue())
                        .append("*")
                        .append(count)
                        .append(" + ");
            }
        }
        return super.cash(String.valueOf(amountResult), currency, cache);
    }

}
