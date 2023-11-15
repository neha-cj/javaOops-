import java.util.Scanner;

class Employee {
    String name, address, phoneNumber;
    int age;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Officer
        Officer officer = new Officer();
        System.out.println("Enter Officer details:");
        System.out.print("Name: ");
        officer.name = scanner.nextLine();
        System.out.print("Age: ");
        officer.age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Phone Number: ");
        officer.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        officer.address = scanner.nextLine();
        System.out.print("Salary: ");
        officer.salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Specialization: ");
        officer.specialization = scanner.nextLine();

        // Input for Manager
        Manager manager = new Manager();
        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        manager.name = scanner.nextLine();
        System.out.print("Age: ");
        manager.age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Phone Number: ");
        manager.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        manager.address = scanner.nextLine();
        System.out.print("Salary: ");
        manager.salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Department: ");
        manager.department = scanner.nextLine();

        // Print details
        System.out.println("\nOfficer details:");
        officer.printSalary();
        System.out.println("Specialization: " + officer.specialization);

        System.out.println("\nManager details:");
        manager.printSalary();
        System.out.println("Department: " + manager.department);

        scanner.close();
    }
}
