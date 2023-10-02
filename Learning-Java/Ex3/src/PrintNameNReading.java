import java.util.Scanner;

public class PrintNameNReading {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int n;
		
		System.out.print("This program will read your name, and then\n");
		System.out.print("ask you how many N times you want to print it!");
		
		System.out.print("\nPlease, type your name: ");
		name = sc.next();
		
		System.out.print("\nPlease, type how many N times you want to print your name: ");
		n = sc.nextInt();
		
		while (counter != n) {
			System.out.println(name);
			counter++;
		}
	}
}