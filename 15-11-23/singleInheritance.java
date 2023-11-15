class Employee {
    void display() {
        System.out.println("Name of the class is Employee.");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}
class Engineer extends Employee {
    void display() {
        super.display();
       
    }

    void calcSalary() {
        super.calcSalary(); // Using super keyword to call display() from the base class
        System.out.println("Name of the class is Engineer.");
        System.out.println("Salary of an engineer is 20000.");
    }
}
public class singleInheritance {
    public static void main(String[] args) {
       Engineer engineer = new Engineer();
       engineer.display();
       engineer.calcSalary();        
    }
}

