import java.util.Scanner;

class Employee {
    String empName;
    int empAge;
    String empGender;
    String empDesignation;
    double empSalary;
    String empAddress;
    int empId;

    public Employee(String empName, int empAge, String empGender, String empDesignation, double empSalary, String empAddress, int empId) {
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empAddress = empAddress;
        this.empId = empId;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Employee[] employees = new Employee[n];

        // Read employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String empName = scanner.nextLine();
            System.out.print("Age: ");
            int empAge = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Gender: ");
            String empGender = scanner.nextLine();
            System.out.print("Designation: ");
            String empDesignation = scanner.nextLine();
            System.out.print("Salary: ");
            double empSalary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Address: ");
            String empAddress = scanner.nextLine();
            System.out.print("ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();

            employees[i] = new Employee(empName, empAge, empGender, empDesignation, empSalary, empAddress, empId);
        }

        System.out.print("Enter the ID of the employee whose details you want to display: ");
        int requiredId = scanner.nextInt();

        // Find and display details of the required employee based on their ID
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.empId == requiredId) {
                System.out.println("Employee Details:");
                System.out.println("Name: " + employee.empName);
                System.out.println("Age: " + employee.empAge);
                System.out.println("Gender: " + employee.empGender);
                System.out.println("Designation: " + employee.empDesignation);
                System.out.println("Salary: " + employee.empSalary);
                System.out.println("Address: " + employee.empAddress);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + requiredId + " not found.");
        }

        scanner.close();
    }
}


