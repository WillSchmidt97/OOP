import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //first math exercise
        Scanner s = new Scanner(System.in);

        System.out.println("In this part of the program you will type two numbers and the program you retrieve to you the result of the first number raised to the power of the secon number.");

        System.out.print("Type the first number: ");
        int value1 = s.nextInt();

        System.out.print("\nType the second number: ");
        int value2 = s.nextInt();

        double result = MathEx1.mathPow(value1, value2);
        System.out.println(value1 + " raised to the power of " + value2 + " is equal to: " + result);

        //second math exercise
        System.out.println("Second part. The program will return the largest and smallest based only on the integer part of a double number.");

        System.out.print("Type the first number: ");
        double dvalue = s.nextDouble();

        System.out.print("\nType the first number: ");
        double dvalue2 = s.nextDouble();

        int result2 = MathEx2.minMath(dvalue, dvalue2);
        System.out.println("The smallest number is: " + result2);
    }
}