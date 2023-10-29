public class InternetUsers {
    private static int count = 0;
    private static int happyCustomers = 0;
    private final static int MAXTIME = 2; // hours

    private String loginName;

    static {
        System.out.println("Let's start browsing!");
        System.out.println("Maximum allotted time for browsing: " + MAXTIME + " hours");
        happyCustomers = count + 1;
    }

    public InternetUsers(String loginName) {
        this.loginName = loginName;
        count++;
    }

    public static void show() {
        System.out.println("Number of internet users: " + count);
        System.out.println("Number of happy customers: " + happyCustomers);
    }

    public void compute(boolean isHappy) {
        if (isHappy) {
            System.out.println("Happy customer: " + loginName);
            happyCustomers++;
        }
    }

    public static void main(String[] args) {
        InternetUsers user1 = new InternetUsers("User1");
        InternetUsers user2 = new InternetUsers("User2");
        InternetUsers user3 = new InternetUsers("User3");

        user1.compute(true);
        user2.compute(false);
        user3.compute(true);

        InternetUsers.show();
    }
}
