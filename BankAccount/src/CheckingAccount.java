import java.math.BigDecimal;

public class CheckingAccount implements Account {
    private String client;
    private String accountNumber;
    private BigDecimal balance;
    private BigDecimal overdraftLimit;

    public CheckingAccount(String client, String accountNumber, BigDecimal balance, BigDecimal overdraftLimit) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(overdraftLimit.negate()) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Deposit successful. New balance: " + balance);
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }
}
