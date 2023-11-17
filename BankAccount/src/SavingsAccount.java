import java.math.BigDecimal;

public class SavingsAccount extends Account {
    public int dailyIncome;
    public SavingsAccount(String client, String accountNumber, BigDecimal balance, int dIncome) {
        super(client, accountNumber, balance);
        dailyIncome = dIncome;
    }

    public void applyInterest(BigDecimal rate) {
        if (rate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("The rate number has to be a positive number and greater than 0.");
        }

        BigDecimal multiplier = rate.divide(BigDecimal.valueOf(100));
        BigDecimal r = balance.multiply(multiplier);
        balance = balance.add(r);

        System.out.println("rate balance: " + r + ". New balance: " + balance);
    }
}
