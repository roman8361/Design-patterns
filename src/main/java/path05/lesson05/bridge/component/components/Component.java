package path05.lesson05.bridge.component.components;

import path05.lesson05.bridge.component.color.Color;

/**
 * Component.
 *
 * @author Ilya_Sukhachev
 */
public abstract class Component {

    protected Color color;

    public Component(Color color) {
        this.color = color;
    }

    public abstract void work();
}
