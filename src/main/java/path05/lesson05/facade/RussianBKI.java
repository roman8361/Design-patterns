package path05.lesson05.facade;

/**
 * RussianBKI.
 *
 * @author Ilya_Sukhachev
 */
public class RussianBKI implements BKI {
    @Override
    public int getDebt(String username) {
        switch (username) {
            case "Vasya":
                return 100;
            case "Petya":
                return 10_000;
            default:
                return 0;
        }
    }

    @Override
    public boolean isExpired(String username) {
        switch (username) {
            case "Vasya":
                return true;
            case "Petya":
                return true;
            default:
                return false;
        }
    }
}
