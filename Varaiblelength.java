public class CalculateArea {

    public static void main(String[] args) {
        System.out.println("Area of a Circle: " + calculateArea("Circle", 5.0));
        System.out.println("Area of a Rectangle: " + calculateArea("Rectangle", 4.0, 6.0));
        System.out.println("Area of a Triangle: " + calculateArea("Triangle", 3.0, 4.0));
    }

    public static double calculateArea(String shape, double... dimensions) {
        switch (shape.toLowerCase()) {
            case "circle":
                if (dimensions.length == 1) {
                    double radius = dimensions[0];
                    return Math.PI * radius * radius;
                }
                break;
            case "rectangle":
                if (dimensions.length == 2) {
                    double length = dimensions[0];
                    double width = dimensions[1];
                    return length * width;
                }
                break;
            case "triangle":
                if (dimensions.length == 2) {
                    double base = dimensions[0];
                    double height = dimensions[1];
                    return 0.5 * base * height;
                }
                break;
        }
        return -1; // Invalid input or dimensions
    }
}
