package path07.homework07.state;

import path07.homework07.api.StateBase;
import path07.homework07.entity.CopyContext;

public class ErrorState extends StateBase {
    @Override
    public void initState(CopyContext context) {
        throw new RuntimeException("Any error");
    }

    @Override
    public void depositMoney(CopyContext context) {
        throw new RuntimeException("Any error");
    }

    @Override
    public void choiceDevice(CopyContext context) {
        throw new RuntimeException("Any error");
    }

    @Override
    public void choiceDoc(CopyContext context) {
        throw new RuntimeException("Any error");
    }

    @Override
    public void printDoc(CopyContext context) {
        throw new RuntimeException("Any error");
    }

    @Override
    public void repeat(CopyContext context) {
        throw new RuntimeException("Any error");
    }

    @Override
    public void getChange(CopyContext context) {
        throw new RuntimeException("Any error");
    }

}
