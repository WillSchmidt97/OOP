public class OddAndEvenPI {
	public static void main(String[] args) {
		int counter = 1;
		
		System.out.print("The program will run each number from 1 to 100 and, ");
		System.out.print("for each number multiple of 4, it will print PI.");
		System.out.println(" For any other number, it'll print the number itself.");
		
		runner(counter);
	}
	
	public static void runner(int r) {
		do {
			if (r % 4 != 0) {
				System.out.println(r);
			}
			else {
				System.out.println("PI");
			}
			
			r++;
		} while(r != 101);
	}
}
