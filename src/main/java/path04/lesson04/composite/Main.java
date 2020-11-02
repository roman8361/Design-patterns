package path04.lesson04.composite;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {
    public static void main(String[] args) {

        MenuComponent[] leafs = {new MenuLeaf("2.1. Admin page")};

        var menu = new MenuComponent[]
                {
                        new MenuLeaf("1. Leaf 1"),
                        new MenuComposite("2. Composite", new MenuComponent[]{new MenuLeaf("2.1. Admin page")}),
                        new MenuComposite("3. Composite", new MenuComponent[]{
                                new MenuLeaf("3.1. Admin page"),
                                new MenuLeaf("3.2. Leaf"),
                                new MenuComposite("3.3 Composite", new MenuComponent[]{
                                        new MenuComposite("3.3.1 Composite", new MenuComponent[]{
                                                new MenuLeaf("3.3.1.1. Leaf")
                                        }),
                                        new MenuLeaf("3.3.2. Leaf")
                                })
                        })
                };

        for (MenuComponent menuComponent : menu) {
            if (menuComponent.isAvailable()) {
                System.out.println(menuComponent.render());
            }
        }
    }
}
