package path05.lesson05.bridge.component;

import ru.iteco.structural.bridge.component.color.Color;
import ru.iteco.structural.bridge.component.color.GreenColor;
import ru.iteco.structural.bridge.component.color.RedColor;
import ru.iteco.structural.bridge.component.components.Button;
import ru.iteco.structural.bridge.component.components.ComboBox;
import ru.iteco.structural.bridge.component.components.Component;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Color red = new RedColor();
        Color green = new GreenColor();

        Component button = new Button(green);
        Component comboBox = new ComboBox(red);

        button.work();
        comboBox.work();

    }
}
