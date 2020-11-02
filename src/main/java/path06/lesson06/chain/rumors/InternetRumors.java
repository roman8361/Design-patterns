package path06.lesson06.chain.rumors;

/**
 * InternetRumors.
 *
 * @author Ilya_Sukhachev
 */
public class InternetRumors extends AbstractRumor {

    private int ping;

    public InternetRumors(AbstractRumor rumor, int ping) {
        super(rumor);
        this.ping = ping;
    }

    public InternetRumors(AbstractRumor rumor) {
        super(rumor);
    }

    @Override
    public void sayRumor(String rumor) {
        if (ping > 1000) {
            System.out.println("Sorry bad connection");
            return;
        }
        System.out.println("Пишут в сети " + rumor);
        super.sayRumor(rumor);
    }
}
