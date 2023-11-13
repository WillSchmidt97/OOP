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

    public void withdraw(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) > 0 && value.compareTo(balance) <= 0) {
            balance = balance.subtract(value);
        }
        else {
            System.out.println("An error occurred. Check if you have sufficient balance for the transaction or try again.");
        }
    }

    public void deposit(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(value);
        }
        else {
            System.out.println("Invalid deposit.");
        }
    }
}
