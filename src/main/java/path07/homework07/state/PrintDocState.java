package path07.homework07.state;

import path07.homework07.api.StateBase;
import path07.homework07.entity.CopyContext;

public class PrintDocState extends StateBase {

    @Override
    public void printDoc(CopyContext context) {
        System.out.println("Печать текста: " + context.getText());
        String change = String.valueOf(Integer.parseInt(context.getDeposit()) - 50);
        context.setDeposit(change);
        context.copyState = new GetChangeState();
    }

}
