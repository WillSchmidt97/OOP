public class PrintNameHundred {
	public static void main(String[] args) {
		String name = "William";
		
		System.out.print("This program will pass my name as a parameter and print it 100x!\n");		
		printName(name);
	}
	
	public static void printName(String name) {
		int counter = 0;
		
		while (counter < 100) {
			System.out.println(name);
			counter++;
		}
	}
}