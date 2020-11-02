package path05.lesson05.facade;

/**
 * LoansFacade.
 *
 * @author Ilya_Sukhachev
 */
public class LoansFacade {

    Bank bank;
    BKI bki;

    public LoansFacade(Bank bank, BKI bki) {
        this.bank = bank;
        this.bki = bki;
    }

    public boolean makeLoanDecision(String username, int sum) {
        if (bank.getCurrentAmount(username) * 2 < sum) {
            return false;
        } else {
            if (bki.isExpired(username) && sum <= 100) {
                return true;
            } else if (bki.isExpired(username) && bki.getDebt(username) < sum) {
                return false;
            }
        }
        return true;


    }

}
