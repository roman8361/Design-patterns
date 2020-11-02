package path02.lesson02.singleton.simple;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {

        Single singleton1 = Single.getInstance();
        Single singleton2 = Single.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
