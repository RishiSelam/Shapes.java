// Rectangle.java
import java.util.Scanner;

class Rectangle extends Shape {
    private double length, width;

    public Rectangle() {
        super("Rectangle");
    }

    public void getInput(Scanner scanner) {
        System.out.print("Enter length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        width = scanner.nextDouble();
    }

    public void calculateShape() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}
