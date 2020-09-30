import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SavingsAccount extends Account {
    public static Logger logger = LogManager.getLogger(SavingsAccount.class);
    double interestRate;

    public SavingsAccount() {
        logger.debug("Created no-arg savings account");
        interestRate = 0.0;
    }

    public SavingsAccount(String name, double balance, double interestRate, Owner owner) {
        super(name, balance, owner);
        this.interestRate = interestRate;
        logger.debug("Created savings account:" + this);
    }

    @Override
    public void monthEnd() {
        double interest = interestRate * getBalance() / 12;

    }

    public String toString() {
        return "Savings Account " + super.toString() +
                " Interest Rate: " + (100*interestRate) + "%";
    }
}