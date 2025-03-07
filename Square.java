// Square.java
import java.util.Scanner;

class Square extends Shape {
    private double side;
    
    public Square() {
        super("Square");
    }
    
    public void getInput(Scanner scanner) {
        System.out.print("Enter side of the square: ");
        side = scanner.nextDouble();
    }
    
    public void calculateShape() {
        System.out.println("Area of Square: " + side * side);
    }
    
    public void calculatePerimeter() {
        System.out.println("Perimeter of Square: " + 4 * side);
    }
}
