import java.math.BigDecimal;

public class SavingsAccount extends Account {
    private final int interestDay;

    public SavingsAccount(String client, String accountNumber, BigDecimal balance, int interestDay) {
        super(client, accountNumber, balance);
        this.interestDay = interestDay;
    }

    public void calculateNewBalance(BigDecimal interestRate) {
        if (interestDay == 27) { // Example: Interest applied on the 27th day of each month
            balance = balance.add(balance.multiply(interestRate));
            System.out.println("Interest applied. New balance: " + balance);
        } else {
            System.out.println("Not the interest day yet.");
        }
    }
}
