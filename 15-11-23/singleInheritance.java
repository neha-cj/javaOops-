import java.util.Scanner;

class Employee {
    void display() {
        System.out.println("Name of the class is Employee.");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    void calcSalary() {
        super.calcSalary(); // Using super keyword to call from base class
        System.out.println("Salary of an engineer is 20000.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter 1 to display Employee salary, 2 to display Engineer salary, or 0 to exit: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                Employee employee = new Employee();
                employee.display();
                employee.calcSalary();
            } else if (choice == 2) {
                Engineer engineer = new Engineer();
                engineer.display();
                engineer.calcSalary();
            } else if (choice != 0) {
                System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
