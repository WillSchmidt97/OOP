import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PasswordControl passwordControl = new PasswordControl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Password Control ===");
            System.out.println("1. Emit a new password");
            System.out.println("2. Give up password line");
            System.out.println("3. Call next password");
            System.out.println("4. Find password position in the line");
            System.out.println("5. Print password line");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Could you please tell us your client's age: ");
                    int cAge = scanner.nextInt();
                    passwordControl.setAge(cAge);
                    passwordControl.emitNewPassword();
                    break;
                case 2:
                    System.out.print("\nType the password you want to give up: ");
                    int giveUp = scanner.nextInt();
                    passwordControl.giveUpQueue(giveUp);
                case 3:
                    int counter = passwordControl.getPreferencialCounter();

                    if (counter >= 2)
                        passwordControl.serverNext();
                    else
                        passwordControl.preferencialNext();
                    break;
                case 4:
                    System.out.print("\nType the password you want to find in the line: ");
                    int findPassword = scanner.nextInt();
                    passwordControl.findPasswordPosition(findPassword);
                case 5:
                    passwordControl.printPasswordQueue();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}