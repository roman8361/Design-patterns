package path06.lesson06.chain.rumors;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        JournalRumors journalRumors = new JournalRumors(null, 500_000);
        InternetRumors internetRumors = new InternetRumors(journalRumors, 2);
        GrandMotherRumors grandMotherRumors = new GrandMotherRumors(internetRumors, true);
        grandMotherRumors.sayRumor("Соль дорожает!");
    }
}
