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
        super.display(); // Using super keyword to call display() from the base class
        System.out.println("Salary of an engineer is 20000.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object of Engineer class
        Engineer engineer = new Engineer();
        engineer.calcSalary(); // This will invoke calcSalary() of Engineer class

        // Using the same object to invoke calcSalary() of Employee class
        engineer.display(); // This will invoke display() of Employee class
        engineer.calcSalary(); // This will invoke calcSalary() of Engineer class, but display() from Employee class

        scanner.close();
    }
}
