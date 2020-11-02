package path05.lesson05.facade;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Bank bank = new VTB();

        BKI bki = new RussianBKI();

        LoansFacade loansFacade = new LoansFacade(bank, bki);
        System.out.println(loansFacade.makeLoanDecision("Vasya", 5000));
    }
}
