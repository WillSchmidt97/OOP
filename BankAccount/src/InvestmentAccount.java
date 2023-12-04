import java.math.BigDecimal;

public class InvestmentAccount implements Account, Taxable {
    private String client;
    private String accountNumber;
    private BigDecimal balance;

    public InvestmentAccount(String client, String accountNumber, BigDecimal balance) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
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
        balance = balance.add(balance.multiply(interestRate));
        System.out.println("Interest applied. New balance: " + balance);
    }

    public BigDecimal calculateTax(BigDecimal interestRate) {
        BigDecimal profit = balance.multiply(interestRate);
        return profit.multiply(new BigDecimal("0.005")); // 0.5% tax on profit
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }
}
