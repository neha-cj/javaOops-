import java.util.Scanner;

class InternetUsers 
{
    static int count = 0;
    static int happyCustomers;
    final static int MAX_TIME = 2;
    String loginName;

    public InternetUsers(String loginName) 
    {
        this.loginName = loginName;
    }

    static 
    {
        System.out.println("Let's start browsing\n");
        System.out.println("Maximum allotted time for browsing: " + MAX_TIME + " hrs");
        happyCustomers = count;
    }

    static void show() 
    {
        System.out.println("Number of internet users: " + count);
        System.out.println("Happy customers: " + happyCustomers);
    }

    void compute() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you a happy customer? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();
        if (response.equals("yes"))
        {
            happyCustomers++;
            System.out.println("Happy customer: " + loginName);
        }
        count++;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of users: ");
        int numUsers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numUsers; i++) 
        {
            System.out.print("Enter login name for user " + (i + 1) + ": ");
            String loginName = scanner.nextLine();
            InternetUsers user = new InternetUsers(loginName);
            user.compute();
        }

        InternetUsers.show();
        scanner.close();
    }
}

