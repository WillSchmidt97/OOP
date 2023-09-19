package Ex4;

public class OddAndEven {
	public static void main(String[] args) {
		int counter = 1;
		
		System.out.print("The program will run each number from 1 to 100 and, ");
		System.out.print("if the number is odd, it will be printed followed by *.");
		System.out.println(" If the number is even, it'll be printed followed by **");
		
		runner(counter);
	}
	
	public static void runner(int r) {
		do {
			if (r % 2 != 0) {
				System.out.println(r + " *");
			}
			else {
				System.out.println(r + " **");
			}
			
			r++;
		} while(r != 101);
	}
}
