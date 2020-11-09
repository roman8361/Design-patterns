package path07.homework07.state;


import path07.homework07.api.StateBase;
import path07.homework07.entity.CopyContext;

public class ChoiceDocState extends StateBase {

    @Override
    public void choiceDoc(CopyContext context) {
        System.out.println("Вы выбрали документ: " + context.getChoiceDoc());
        context.copyState = new PrintDocState();
    }

}
