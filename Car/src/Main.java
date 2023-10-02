import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("What is the car's brand: ");
            String brand = scanner.nextLine();

            System.out.println("What is the car's model: ");
            String model = scanner.nextLine();

            System.out.println("Inform the car's current speed (In KM/H): ");
            int speed = scanner.nextInt();

            Car car = new Car(model, brand);

            System.out.println("\nCar: ");
            System.out.println("Model: " + car.getModel());
            System.out.println("Brand: " + car.getBrand());

            String gear = car.calculateGear(speed);
            System.out.println("Your gear should be: " + gear);

            scanner.close();
        }
}