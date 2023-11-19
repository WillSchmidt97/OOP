import java.math.BigDecimal;

public class CheckingAccount extends Account {
    public BigDecimal limit;
    public CheckingAccount(String client, String accountNumber, BigDecimal balance, BigDecimal l) {
        super(client, accountNumber, balance);
        limit = l;
    }

    @Override
    public void withdraw(BigDecimal value) {
        if (value.compareTo(limit) <= 0) {
            balance = balance.subtract(value);
        }
        else {
            System.out.println("An error occurred. Chosen amount above the limit rate.");
        }
    }
}
