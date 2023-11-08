import java.util.Scanner;

public class VariableArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;
        System.out.println("Select a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
        while (continueCalculations) {
            
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateAndPrintArea("Circle", calculateCircleArea(scanner));
                    break;
                case 2:
                    calculateAndPrintArea("Rectangle", calculateRectangleArea(scanner));
                    break;
                case 3:
                    calculateAndPrintArea("Triangle", calculateTriangleArea(scanner));
                    break;
                case 4:
                    continueCalculations = false;
                    break;
                default:
                    System.err.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }
        scanner.close();
    }

    private static double calculateCircleArea(Scanner scanner) {
        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();
        return Math.PI * radius * radius;
    }

    private static double calculateRectangleArea(Scanner scanner) {
        System.out.println("Enter the length:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        return length * width;
    }

    private static double calculateTriangleArea(Scanner scanner) {
        System.out.println("Enter the base:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height:");
        double height = scanner.nextDouble();
        return 0.5 * base * height;
    }

    private static void calculateAndPrintArea(String shape, double... dimensions) {
        double area = 0.0;
        for (double dimension : dimensions) {
            area = dimension;
        }
        System.out.println("Area of " + shape + ": " + area);
    }
}
