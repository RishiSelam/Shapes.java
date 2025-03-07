// EquilateralPyramid.java
import java.util.Scanner;

class EquilateralPyramid extends Shape implements Volume {
    private double base, height;
    
    public EquilateralPyramid() {
        super("Equilateral Pyramid");
    }
    
    public void getInput(Scanner scanner) {
        System.out.print("Enter base length of the pyramid: ");
        base = scanner.nextDouble();
        System.out.print("Enter height of the pyramid: ");
        height = scanner.nextDouble();
    }
    
    public void calculateShape() {
        double slantHeight = Math.sqrt((base / 2) * (base / 2) + height * height);
        double lateralSurfaceArea = 2 * base * slantHeight;
        double baseArea = base * base;
        System.out.println("Surface Area of Pyramid: " + (lateralSurfaceArea + baseArea));
    }
    
    public void calculateVolume() {
        System.out.println("Volume of Pyramid: " + (1.0 / 3) * base * base * height);
    }
    
    public void calculatePerimeter() {
        System.out.println("Perimeter of Pyramid Base: " + (4 * base));
    }
}