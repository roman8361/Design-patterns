package path03.lesson03.prototype.load;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {

        var prototypeFactory = new PrototypeFactory();
        var color = prototypeFactory.cloneColor("RedColor");

        color.setCode("#FF6347");
        System.out.println("======================");
        System.out.println("Color: " + color);
        System.out.println("ColorCode: " + color.getCode());
        System.out.println("ColorName: " + color.getName());

        color = prototypeFactory.cloneColor("RedColor");
        System.out.println("======================");
        System.out.println("Color: " + color);
        System.out.println("ColorCode: " + color.getCode());
        System.out.println("ColorName: " + color.getName());

        var color2 = (TransparentRedColor) prototypeFactory.cloneColor("TransparentRedColor");
        color2.setTransparent(30);
        System.out.println("======================");
        System.out.println("Color: " + color2);
        System.out.println("ColorCode: " + color2.getCode());
        System.out.println("ColorName: " + color2.getName());
        System.out.println("ColorTransparent: " + color2.getTransparent());

        color2 = (TransparentRedColor) prototypeFactory.cloneColor("TransparentRedColor");
        System.out.println("======================");
        System.out.println("Color: " + color2);
        System.out.println("ColorCode: " + color2.getCode());
        System.out.println("ColorName: " + color2.getName());
        System.out.println("ColorTransparent: " + color2.getTransparent());
    }
}
