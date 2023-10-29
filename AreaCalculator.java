public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Circle Area: " + calculateArea("circle", 5.0));
        System.out.println("Rectangle Area: " + calculateArea("rectangle", 4.0, 6.0));
        System.out.println("Triangle Area: " + calculateArea("triangle", 3.0, 4.0));
    }

    public static double calculateArea(String shape, double... dimensions) {
        if (shape.equalsIgnoreCase("circle") && dimensions.length == 1) {
            double radius = dimensions[0];
            return Math.PI * radius * radius;
        } else if (shape.equalsIgnoreCase("rectangle") && dimensions.length == 2) {
            double length = dimensions[0];
            double width = dimensions[1];
            return length * width;
        } else if (shape.equalsIgnoreCase("triangle") && dimensions.length == 2) {
            double base = dimensions[0];
            double height = dimensions[1];
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("Invalid shape or incorrect number of dimensions");
        }
    }
}
