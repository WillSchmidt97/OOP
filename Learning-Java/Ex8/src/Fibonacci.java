import java.util.Scanner;

public class Fibonacci {
	static public void fibonacciRunner(int r) {
		int number = 0;
		int number2 = 1;
		int number3 = 0;
		int counter = 0;
		int checker = 0;
		
		while(number3 <= r) {
			System.out.print(number3);
			checker = number3;
			number = number2;
			number2 = number3;
			number3 = number + number2;
			System.out.print(" ");
			counter++;
		}
		System.out.println();
		if (checker == r) {
			System.out.print(r + " occupies the position number " + counter + " in the series");			
		}
		else {
			System.out.print("The closest number to the one you typed occupies the position number ");
			System.out.print(counter);
			System.out.print(" in the fibonacci series.");
		}
	}
	
	static public void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("You will type an entry value and the program will");
		System.out.println(" answer with the position this value has in the fibonacci series.");
		
		System.out.print("Type the value: ");
		int fvalue = s.nextInt();
		
		fibonacciRunner(fvalue);
		
		s.close();
				
	}
}
