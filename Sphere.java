//Sphere.java
import java.util.Scanner;

public class Sphere {
    private double radius;

    public Sphere() {
        this.radius = 0;
    }

    public void getInput(Scanner scanner) {
        System.out.print("Enter the radius of the sphere: ");
        this.radius = scanner.nextDouble();
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public void display() {
        System.out.println("Sphere Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}
