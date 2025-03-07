// Circle.java
import java.util.Scanner;

class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super("Circle");
    }
    
    public void getInput(Scanner scanner) {
        System.out.print("Enter radius of the circle: ");
        radius = scanner.nextDouble();
    }
    
    public void calculateShape() {
        System.out.println("Area of Circle: " + Math.PI * radius * radius);
    }
    
    public void calculatePerimeter() {
        System.out.println("Perimeter of Circle: " + 2 * Math.PI * radius);
    }
}