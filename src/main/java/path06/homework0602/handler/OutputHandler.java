package path06.homework0602.handler;

public class OutputHandler extends CommonHandler {

    public OutputHandler(CommonHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String cash(String amount, String currency, StringBuilder cache) {
        if (!amount.equals("0")) {
            System.out.print("Unable to issue the requested amount");
            cache = new StringBuilder();
        }
        return super.cash(amount, currency, cache);
    }

}
