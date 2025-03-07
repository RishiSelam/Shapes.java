// Main.java
// Name: Rishi Selam
// PRN: 23070126107
// Batch: AIML B2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select a shape:");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Circle circle = new Circle();
                    circle.getInput(scanner);
                    circle.calculateShape();
                    circle.calculatePerimeter();
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    rectangle.getInput(scanner);
                    rectangle.calculateShape();
                    rectangle.calculatePerimeter();
                    break;
                case 3:
                    Square square = new Square();
                    square.getInput(scanner);
                    square.calculateShape();
                    square.calculatePerimeter();
                    break;
                case 4:
                    Sphere sphere = new Sphere();
                    sphere.getInput(scanner);
                    System.out.println("Volume: " + sphere.calculateVolume());
		    System.out.println("Surface Area: " + sphere.calculateSurfaceArea());
                    sphere.calculateVolume();
                    break;
                case 5:
                    Cylinder cylinder = new Cylinder();
                    cylinder.getInput(scanner);
                    cylinder.calculateShape();
                    cylinder.calculateVolume();
                    break;
                case 6:
                    EquilateralPyramid pyramid = new EquilateralPyramid();
                    pyramid.getInput(scanner);
                    pyramid.calculateShape();
                    pyramid.calculateVolume();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}