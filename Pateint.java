import java.util.Scanner;

class Patient {
    private int idNumber;
    private int age;
    private String bloodData;

    public Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = "0+";
    }

    public Patient(int idNumber, int age, String bloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getBloodData() {
        return bloodData;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a patient object using the overload constructor with user input
        System.out.println("Enter the patient's ID Number:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the patient's Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the patient's Blood Data:");
        String bloodData = scanner.nextLine();

        Patient patient = new Patient(id, age, bloodData);

        // Display patient information
        System.out.println("Patient Information:");
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Data: " + patient.getBloodData());

        
    }
}
