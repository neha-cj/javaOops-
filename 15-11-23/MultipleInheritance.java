import java.util.Scanner;

interface Sports {
    float sportwt = 6.0F; // Final variable in interface
    void putwt(); // Abstract method in interface
}

class Student {
    int rollnumber;

    void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollnumber = scanner.nextInt();
    }

    void putNumber() {
        System.out.println("Roll No: " + rollnumber);
    }
}

class Test extends Student implements Sports {
    float term1, term2;

    void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Term 1 Marks: ");
        term1 = scanner.nextFloat();
        System.out.print("Enter Term 2 Marks: ");
        term2 = scanner.nextFloat();
    }

    void putMarks() {
        System.out.println("Marks obtained");
        System.out.println("Term 1=" + term1);
        System.out.println("Term 2=" + term2);
    }

    @Override
    public void putwt() {
        System.out.println("Sports weightage=" + sportwt);
    }
}

class Results extends Test {
    void displayResult() {
        putNumber();
        putMarks();
        putwt();
        float totalScore = term1 + term2 + sportwt;
        System.out.println("Total Score=" + totalScore);
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Results result = new Results();
        result.getNumber();
        result.getMarks();

        System.out.println("\nResult Details:");
        result.displayResult();

        scanner.close();
    }
}
