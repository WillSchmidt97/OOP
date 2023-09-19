import java.util.Scanner;

public class PrintTriangleInput {
	public static void printTriangle(int numTriangles, int numLayers) {
		int counter = 1;
		
		while(counter <= numTriangles) {			
			for(int i = 1; i <= numLayers; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			counter++;
			System.out.println();
		}
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome! I will print a certain number of triangles based both ");	
        System.out.println("on the number of triangles you type and the number of layers.");
        
        System.out.print("Type the number of triangles you want me to print: ");
        int numTriangles = scanner.nextInt();
        
        System.out.print("Type the number of layers you want your triangle to have: ");
        int numLayers = scanner.nextInt();
        
        printTriangle(numTriangles, numLayers);

        scanner.close();
    }
}