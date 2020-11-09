package path07.homework07.entity;

import lombok.Getter;
import path07.homework07.api.CopyState;
import path07.homework07.state.InitState;


@Getter
public class CopyContext {

    public CopyState copyState;

    private TypeDevice typeDevice;

    private String deposit;

    private String text;

    private String choiceDoc;

    public CopyContext() {
        this.copyState = new InitState();
        this.copyState.initState(this);
    }

    public void depositMoney(String deposit){
        this.deposit = deposit;
        copyState.depositMoney(this);
    }

    public void choiceDevice(TypeDevice typeDevice) {
        this.typeDevice = typeDevice;
        copyState.choiceDevice(this);
    }

    public void choiceDoc(String choiceDoc) {
        this.choiceDoc = choiceDoc;
        copyState.choiceDoc(this);
    }

    public void printDoc(String text) {
        this.text = text;
        copyState.printDoc(this);
    }

    public void getChange(){
        copyState.getChange(this);
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

}
