package path04.lesson04.composite;

import java.util.Arrays;

/**
 * MenuComposite.
 *
 * @author Ilya_Sukhachev
 */
public class MenuComposite extends MenuComponent {

    private MenuComponent[] leafs;

    protected MenuComposite(String name, MenuComponent[] leafs) {
        super(name);
        this.leafs = leafs;
    }

    @Override
    public boolean isAvailable() {
        return Arrays.stream(leafs)
                .anyMatch(menuComponent -> menuComponent.isAvailable());
    }

    @Override
    public String render() {
        var str = new StringBuilder();
        for (MenuComponent leaf : leafs) {
            if (leaf.isAvailable()) {
                var child = leaf.render();
                str.append(child);
            }
        }

        return str.toString();
    }
}
