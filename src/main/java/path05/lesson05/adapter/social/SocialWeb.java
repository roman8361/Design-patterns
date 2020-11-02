package path05.lesson05.adapter.social;

/**
 * SocialWeb.
 *
 * @author Ilya_Sukhachev
 */
public interface SocialWeb {

    void getFriends(int userId);

    boolean postMessage(String message, int userId, Boolean notified);

}
