package path05.lesson05.facade;

/**
 * BKI.
 *
 * @author Ilya_Sukhachev
 */
public interface BKI {

    int getDebt(String username);
    boolean isExpired(String username);

}
