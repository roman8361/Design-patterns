package path07.homework07.state;

import path07.homework07.api.StateBase;
import path07.homework07.entity.CopyContext;

public class InitState extends StateBase {

    @Override
    public void initState(CopyContext context) {
        System.out.println("Добро пожаловать в КопиМашину!!");
        context.copyState = new DepositState();
    }

}
