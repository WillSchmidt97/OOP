import java.util.Scanner;

public class PrintTriangle {
	public static void printTriangle(int numLayers) {
		for(int i = 1; i <= numLayers; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome! I will print a triangle based on the level of layers you type.");	
        
        System.out.print("Type the number of layers you want your triangle to have: ");
        int numLayers = scanner.nextInt();
        
        printTriangle(numLayers);

        scanner.close();
    }
}

