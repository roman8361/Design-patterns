package path05.lesson05.bridge.component.components;


import path05.lesson05.bridge.component.color.Color;

/**
 * Button.
 *
 * @author Ilya_Sukhachev
 */
public class Button extends Component {
    public Button(Color color) {
        super(color);
    }

    @Override
    public void work() {
        System.out.println("i work with color" + color.applyColor());
    }
}
