import java.math.BigDecimal;

public class Account {
    public String client;
    public String accountNumber;
    public BigDecimal balance;

    public Account(String client, String accountNumber, BigDecimal balance) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Deposit successful. New balance: " + balance);
    }
}
