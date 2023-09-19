import java.util.Scanner;

public class BodyMassIndex {

    public static double calculateBMI(double mass, double height) {
        return mass / (height * height);
    }
    
    public static int qualityBMI(double bmi) {
        if (bmi < 17) {
            return 1;
        } else if (bmi >= 17 && bmi < 18.5) {
            return 2;
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return 3;
        } else if (bmi >= 25 && bmi < 29.9) {
            return 4; 
        } else {
            return 5;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Body Mass Index (BMI) calculator.");
        System.out.println();

        try {
            System.out.print("Please, tell me your weight in KG: ");
            double mass = s.nextDouble();

            System.out.print("Now tell me your height IN METERS: ");
            double height = s.nextDouble();

            double bmi = calculateBMI(mass, height);
            System.out.printf("Your BMI is: %.2f%n", bmi);
            
            int quality = qualityBMI(bmi);
            
            switch (quality) {
            	case 1:
            		System.out.print("You are way underweight!");
            		break;
            	case 2:
            		System.out.print("You are underweight.");
            		break;
            	case 3:
            		System.out.print("You have a normal weight.");
            		break;
            	case 4:
            		System.out.print("You are overweight.");
            		break;
            	case 5:
            		System.out.print("You are way overweight!");
            		break;
            	default:
            		System.out.print("There was an error calculating your BMI. Please, try again.");
            		break;
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        } finally {
            s.close();
        }
    }
}
