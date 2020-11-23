package path06.homework0602.handler;

public abstract class CommonHandler {

    private CommonHandler nextHandler;

    protected CommonHandler(CommonHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(String banknote) {
        return nextHandler != null && nextHandler.validate(banknote);
    }

    public String cash(String amount, String currency, StringBuilder cache) {
        return nextHandler != null ? nextHandler.cash(amount, currency, cache) : cache.toString();
    }

    public String cash(String amount){
        String[] arr = amount.split(" ");
        return cash(arr[0], arr[1], new StringBuilder());
    }

}