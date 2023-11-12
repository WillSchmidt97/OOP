//Exercise to train getters and setters
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Type the rectangle's width: ");
        double w = scanner.nextDouble();

        System.out.print("\nType the rectangle's length: ");
        double l = scanner.nextDouble();

        rectangle.setWidth(w);
        rectangle.setLength(l);

        System.out.println("Rectangle's width: " + rectangle.getWidth());
        System.out.println("Rectangle's length: " + rectangle.getLength());

        double area = rectangle.areaRec();
        System.out.print("\nRectangle's area: " + area);

        double perimeter = rectangle.perimeterRec();
        System.out.print("\nRectangle's perimeter: " + perimeter);
    }
}