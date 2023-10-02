public class Employee {
    private String name;
    private double salary;
    private double mealTicket;

    public void setMealTicket(double mealTicket) {
        this.mealTicket = mealTicket;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void mealTicketCalculator(Employee employee) {
        System.out.println("Employee: " + employee.name);
        System.out.println("Employee salary: " + employee.salary);
        System.out.println("Employee meal ticket percentage: " + employee.mealTicket);

        double mt = (employee.salary * employee.mealTicket) / 100;

        System.out.println("According to the employee's salary and meal ticket percentage, the value paid in the meal ticket card will be: " + mt);
    }
}
