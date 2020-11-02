package path03.lesson03.builder.moto;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Moto moto = new MotoBuilder().build("Honda");

        System.out.println(moto);

        moto = new MotoBuilder().build("Lada");
        System.out.println(moto);
    }
}
