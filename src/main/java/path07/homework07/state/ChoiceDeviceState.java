package path07.homework07.state;


import path07.homework07.api.StateBase;
import path07.homework07.entity.CopyContext;

public class ChoiceDeviceState extends StateBase {

    @Override
    public void choiceDevice(CopyContext context) {
        System.out.println("Ваше устройство: " + context.getTypeDevice().name());
        context.copyState = new ChoiceDocState();
    }

}
