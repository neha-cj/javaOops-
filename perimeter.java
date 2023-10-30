import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle() 
    {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width)
     {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter() 
    {
    
        return 2 * (length + width);
    }
}

public class perimeter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Enter the length of the first rectangle:");
        double length1 = scanner.nextDouble();
        System.out.println("Enter the width of the first rectangle:");
        double width1 = scanner.nextDouble();

        rectangle1 = new Rectangle(length1, width1);

        Rectangle rectangle2 = new Rectangle();
        System.out.println("Enter the length of the second rectangle:");
        double length2 = scanner.nextDouble();
        System.out.println("Enter the width of the second rectangle:");
        double width2 = scanner.nextDouble();

        rectangle2 = new Rectangle(length2, width2);
        double perimeter1 = rectangle1.calculatePerimeter();
        double perimeter2 = rectangle2.calculatePerimeter();

        System.out.println("Perimeter of the first rectangle: " + perimeter1);
        System.out.println("Perimeter of the second rectangle: " + perimeter2);

        scanner.close();
    }
}
