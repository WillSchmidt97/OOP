import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("We are W-helper. We help companies to raise their manager's salary based on their choice.");
        System.out.println();

        System.out.print("Type your manager's name: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Now, tell us your manager's currently salary: ");
        double s = scanner.nextDouble();
        System.out.println();

        Manager manager = new Manager(s, name);

        System.out.println("Now, choose how you want to raise your manager's salary. We have two options: ");
        System.out.println("Option 1: Increase your manager's salary based on a fixed rate of 10%.");
        System.out.println("Option 2: Increase your manager's salary based on a variable rate chosen by yourself.");
        System.out.println();

        System.out.println("Choose an option: ");
        System.out.println("1 - Option 1\n2 - Option 2\n3 - Exit");

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> manager.managerNewSalary();
            case 2 -> {
                System.out.print("Choose the rate you want to use to calculate your manager's new salary: ");
                double variableRate = scanner.nextDouble();
                System.out.println();
                manager.managerNewSalary(variableRate);
            }
            case 3 -> {
                System.out.println("Come back whenever you need us!");
                scanner.close();
                System.exit(0);
            }
            default -> System.out.println("Invalid option.");
        }

        System.out.println("Thank you a lot for using our services!");
    }
}