package path05.lesson05.bridge.component;

import path05.lesson05.bridge.component.color.Color;
import path05.lesson05.bridge.component.color.GreenColor;
import path05.lesson05.bridge.component.color.RedColor;
import path05.lesson05.bridge.component.components.Button;
import path05.lesson05.bridge.component.components.ComboBox;
import path05.lesson05.bridge.component.components.Component;


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
