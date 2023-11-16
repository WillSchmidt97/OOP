import java.math.BigDecimal;

public class SavingsAccount extends Account {
    public int dailyIncome;
    public SavingsAccount(String client, String accountNumber, BigDecimal balance, int dIncome) {
        super(client, accountNumber, balance);
        dailyIncome = dIncome;
    }
}
