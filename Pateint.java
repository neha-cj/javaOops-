import java.util.Scanner;

class Patient 
{
    private int id;
    private int age;
    private String bloodData;

    // Default constructor
    public Patient() 
    {
        id = 0;
        age = 0;
        bloodData = "0/1";
    }

    // Overloaded constructor
    public Patient(int id, int age, String bloodData) 
    {
        this.id = id;
        this.age = age;
        this.bloodData = bloodData;
    }

    public int getId() 
    {
        return id;
    }

    public int getAge() 
    {
        return age;
    }

    public String getBloodData() 
    {
        return bloodData;
    }
}

class testPatient 
{
    public static void main(String[] args) 
    {
        // Create a patient using the default constructor
        Patient patient1 = new Patient();
        System.out.println("Patient 1 - Default Constructor");
        System.out.println("ID: " + patient1.getId());
        System.out.println("Age: " + patient1.getAge());
        System.out.println("Blood Data: " + patient1.getBloodData());
        System.out.println();

        // Create a patient using the overloaded constructor with user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the patient's ID:");
        int id = scanner.nextInt();
        System.out.println("Enter the patient's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the patient's blood data (e.g., 'A/B'): ");
        String bloodData = scanner.nextLine();

        Patient patient2 = new Patient(id, age, bloodData);
        System.out.println("\nPatient 2 - Overloaded Constructor");
        System.out.println("ID: " + patient2.getId());
        System.out.println("Age: " + patient2.getAge());
        System.out.println("Blood Data: " + patient2.getBloodData());

        scanner.close();
    }
}
