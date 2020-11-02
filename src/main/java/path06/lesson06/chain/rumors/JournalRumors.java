package path06.lesson06.chain.rumors;

/**
 * JournalRumors.
 *
 * @author Ilya_Sukhachev
 */
public class JournalRumors extends AbstractRumor {

    private long budget;

    public JournalRumors(AbstractRumor rumor, int ping) {
        super(rumor);
        this.budget = ping;
    }

    public JournalRumors(AbstractRumor rumor) {
        super(rumor);
    }

    @Override
    public void sayRumor(String rumor) {
        if (budget > 1_000_000) {
            System.out.println("Информация не подтвердилась");
            return;
        }
        System.out.println("В журнале пишут " + rumor);
        super.sayRumor(rumor);
    }
}
