import java.math.BigDecimal;

interface Account {
    void withdraw(BigDecimal amount);

    void deposit(BigDecimal amount);
    BigDecimal getBalance();
}

interface Taxable {
    BigDecimal calculateTax(BigDecimal interestRate);
}