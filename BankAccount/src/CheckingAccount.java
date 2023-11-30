import java.math.BigDecimal;

public class CheckingAccount extends Account {
    public BigDecimal limit;
    public CheckingAccount(String client, String accountNumber, BigDecimal balance, BigDecimal limit) {
        super(client, accountNumber, balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(limit.negate()) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
