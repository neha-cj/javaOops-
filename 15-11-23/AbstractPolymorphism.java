import java.util.Scanner;

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

public class AbstractPolymorphismExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating objects of each shape class
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        // Invoking the numberOfSides method for each shape
        System.out.println("Details of Shapes:");
        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();

        scanner.close();
    }
}
