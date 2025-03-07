// Cylinder.java
import java.util.Scanner;

class Cylinder extends Shape implements Volume {
    private double radius, height;
    
    public Cylinder() {
        super("Cylinder");
    }
    
    public void getInput(Scanner scanner) {
        System.out.print("Enter radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        height = scanner.nextDouble();
    }
    
    public void calculateShape() {
        System.out.println("Surface Area of Cylinder: " + (2 * Math.PI * radius * (radius + height)));
    }
    
    public void calculateVolume() {
        System.out.println("Volume of Cylinder: " + Math.PI * radius * radius * height);
    }
    
    public void calculatePerimeter() {
        System.out.println("A cylinder does not have a perimeter.");
    }
}