package path05.lesson05.adapter.social;

public class App {

    public static void main(String[] args) {
        Context contextVk = new Vk();
        SocialWebAdapter socialWebAdapter = new SocialWebAdapter(contextVk);
        socialWebAdapter.getFriends(1);
        socialWebAdapter.postMessage("Hello from vk ", 1, true);


        System.out.println("######################");
        Context contextFb = new Fb();
        SocialWebAdapter socialWebAdapter2 = new SocialWebAdapter(contextFb);

        socialWebAdapter2.getFriends(2);
        socialWebAdapter2.postMessage("FB forever", 2, false);
    }

}
