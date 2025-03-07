// Shape.java
import java.util.Scanner;
abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    abstract void calculateShape();
    abstract void calculatePerimeter();
}