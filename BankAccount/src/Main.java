import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to W-Bank, I am your virtual assistant!");
        System.out.println("Please, choose among the options what you want to do: ");

        System.out.println("\n1 - Register a new account.");

        System.out.print("What would you like to do: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Random r = new Random();

                System.out.print("\nDo you want to open a saving account? If you choose NO your account will be a standard checking account. YES - 1 NO - 0: ");
                int accountChecker = scanner.nextInt();

                if (accountChecker != 1) {
                    System.out.print("\nTell us your name, please: ");
                    String name = scanner.nextLine();

                    String accountNumber = String.format("%09d", r.nextInt(1000000000));

                    BigDecimal balance = new BigDecimal("0");
                    BigDecimal limit = new BigDecimal("200");

                    CheckingAccount checkingAccount = new CheckingAccount(name, accountNumber, balance, limit);
                }
                else {
                    System.out.print("\nTell us your name, please: ");
                    String name = scanner.nextLine();

                    String accountNumber = String.format("%09d", r.nextInt(1000000000));

                    BigDecimal balance = new BigDecimal("0");

                    System.out.print("\nWhich daily rate you would like your Savings Account to have: ");
                    int income = scanner.nextInt();

                    SavingsAccount savingsAccount = new SavingsAccount(name, accountNumber, balance, income);
                }
        }
    }
}