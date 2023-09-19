public class PrintNameN {
	public static void main(String[] args) {
		String name = "Bill Schmidt";
		int n = 3;
		
		System.out.print("This program will pass both my name and\n");
		System.out.print("how many N times I want it to be printed as a parameter!");
		
		printNameN(name, n);
	}
	
    public static void printNameN(String name, int n) {
        int counter = 0;
        
        System.out.println("\nPrinting your name N times: ");
        
        while (counter != n) {
            System.out.println(name);
            counter++;
        }
    }
}
