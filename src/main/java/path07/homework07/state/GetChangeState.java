package path07.homework07.state;

import path07.homework07.api.StateBase;
import path07.homework07.entity.CopyContext;

public class GetChangeState extends StateBase {

    @Override
    public void getChange(CopyContext context) {
        System.out.println("Ваша сдача: " + context.getDeposit());
    }

}
