package path07.lesson07.state;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        var context1 = new ConnectionContext("Url_1");
        context1.connect();
        context1.read();
        context1.close();
        System.out.println();

        try {
            var context2 = new ConnectionContext("Url_2");
            context2.read();
        } catch (Exception ex) {
            System.out.println("context2: " + ex.getMessage());
        }
        System.out.println();

        try {
            var context3 = new ConnectionContext("Url_3");
            context3.connect();
            context3.close();
            context3.read();
        } catch (Exception ex) {
            System.out.println("context3: " + ex.getMessage());
        }
        System.out.println();
    }

}
