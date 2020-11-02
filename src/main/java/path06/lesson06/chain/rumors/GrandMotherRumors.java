package path06.lesson06.chain.rumors;

/**
 * JournalRumors.
 *
 * @author Ilya_Sukhachev
 */
public class GrandMotherRumors extends AbstractRumor {

    private boolean isALife;

    public GrandMotherRumors(AbstractRumor rumor) {
        super(rumor);
    }

    public GrandMotherRumors(AbstractRumor rumor, boolean isALife) {
        super(rumor);
        this.isALife = isALife;
    }

    @Override
    public void sayRumor(String rumor) {
        if (!isALife) {
            System.out.println("Sorry RIP");
            return;
        }
        System.out.println("Бабка сказала " + rumor);
        super.sayRumor(rumor);
    }
}
