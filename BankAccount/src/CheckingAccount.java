import java.math.BigDecimal;

public class CheckingAccount extends Account {
    public BigDecimal limit;
    public CheckingAccount(String client, String accountNumber, BigDecimal balance, BigDecimal l) {
        super(client, accountNumber, balance);
        limit = l;
    }
}
