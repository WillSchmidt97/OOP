public class Manager {
    double salary;
    String name;

    public Manager(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public void managerNewSalary() {
        double newSalary = this.salary + ((this.salary * 10) / 100);

        System.out.println("Using the fixed rate: ");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + newSalary);
    }

    public void managerNewSalary(double v) {
        double newSalary = this.salary + ((this.salary * v) / 100);

        System.out.println("Using the variable rate: ");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + newSalary);
    }
}
