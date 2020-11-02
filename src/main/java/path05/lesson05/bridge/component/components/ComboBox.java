package path05.lesson05.bridge.component.components;


import path05.lesson05.bridge.component.color.Color;

/**
 * ComboBox.
 *
 * @author Ilya_Sukhachev
 */
public class ComboBox extends Component {
    public ComboBox(Color color) {
        super(color);
    }

    @Override
    public void work() {
        System.out.println("i work with color" + color.applyColor());
    }
}
