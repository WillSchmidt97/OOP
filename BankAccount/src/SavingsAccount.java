import java.math.BigDecimal;

public class SavingsAccount implements Account, Taxable {
    private String client;
    private String accountNumber;
    private BigDecimal balance;
    private int interestDay;

    public SavingsAccount(String client, String accountNumber, BigDecimal balance, int interestDay) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestDay = interestDay;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void calculateNewBalance(BigDecimal interestRate) {
        if (interestDay == 27) {
            balance = balance.add(balance.multiply(interestRate));
            System.out.println("Interest applied. New balance: " + balance);
        } else {
            System.out.println("Not the interest day yet.");
        }
    }

    @Override
    public BigDecimal calculateTax(BigDecimal interestRate) {
        return BigDecimal.ZERO; // Savings accounts may not have tax in this example
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }
}
