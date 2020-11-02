package path04.lesson04.composite;

/**
 * MenuLeaf.
 *
 * @author Ilya_Sukhachev
 */
public class MenuLeaf extends MenuComponent {
    public MenuLeaf(String name) {
        super(name);
    }

    @Override
    public boolean isAvailable() {
        return name.contains("Admin page");
    }

    @Override
    public String render() {
        return name;
    }
}
