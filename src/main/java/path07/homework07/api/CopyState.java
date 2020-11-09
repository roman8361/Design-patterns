package path07.homework07.api;

import path07.homework07.entity.CopyContext;

public interface CopyState {

    void initState(CopyContext context);

    void depositMoney(CopyContext context);

    void choiceDevice(CopyContext context);

    void choiceDoc(CopyContext context);

    void printDoc(CopyContext context);

    void repeat(CopyContext context);

    void getChange(CopyContext context);

}
