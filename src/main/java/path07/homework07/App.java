package path07.homework07;

import path07.homework07.entity.CopyContext;
import path07.homework07.entity.TypeDevice;

public class App {

    public static void main(String[] args) {
        firstContext();
        secondContext();
    }

    private static void firstContext() {
        var context1 = new CopyContext();
        context1.depositMoney("1000");
        context1.choiceDevice(TypeDevice.Flash);
        context1.choiceDoc("1.txt");
        context1.printDoc("Iha Iha Iha");
        context1.getChange();
    }

    private static void secondContext(){
        var context2 = new CopyContext();
        try {
            context2.choiceDevice(TypeDevice.Flash);
            context2.printDoc("333");
        } catch (Exception e) {
            System.out.println("Очерёдность нарушена!!!");
        }
    }

}
