package path07.homework07.api;


import path07.homework07.entity.CopyContext;

public abstract class StateBase implements CopyState {

    @Override
    public void initState(CopyContext context) {
        throw new RuntimeException("Пожалуйста следуйте очерёдности");
    }

    @Override
    public void depositMoney(CopyContext context) {
        throw new RuntimeException("Пожалуйста следуйте очерёдности");
    }

    @Override
    public void choiceDevice(CopyContext context) {
        throw new RuntimeException("Пожалуйста следуйте очерёдности");
    }

    @Override
    public void choiceDoc(CopyContext context) {
        throw new RuntimeException("Пожалуйста следуйте очерёдности");
    }

    @Override
    public void printDoc(CopyContext context) {
        throw new RuntimeException("Пожалуйста следуйте очерёдности");
    }

    @Override
    public void repeat( CopyContext context) {
        throw new RuntimeException("Пожалуйста следуйте очерёдности");
    }

    @Override
    public void getChange(CopyContext context) {
        throw new RuntimeException("Пожалуйста следуйте очерёдности");
    }

}
