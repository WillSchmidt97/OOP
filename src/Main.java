import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the employee's name: ");
        employee.setName(scanner.nextLine());

        System.out.print("\nType the employee's salary: ");
        employee.setSalary(scanner.nextDouble());

        System.out.print("\nType the meal ticket % according to the employee's salary (It is not needed to add the symbol %): ");
        employee.setMealTicket(scanner.nextDouble());

        System.out.print("\n");

        Employee.mealTicketCalculator(employee);
    }
}