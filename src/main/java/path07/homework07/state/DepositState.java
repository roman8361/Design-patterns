package path07.homework07.state;

import path07.homework07.api.StateBase;
import path07.homework07.entity.CopyContext;

public class DepositState extends StateBase {

    @Override
    public void depositMoney(CopyContext context) {
        System.out.println("Ваш депозит равен: " + context.getDeposit());
        context.copyState = new ChoiceDeviceState();
    }

}
