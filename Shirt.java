import java.util.Scanner;

class Shirt {
    double collarSize;
    int sleeveLength;
    static String material = "cotton"; // Class variable set to "cotton"

    public void setCollarSize(double collarSize) {
        this.collarSize = collarSize;
    }

    public double getCollarSize() {
        return collarSize;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public static String getMaterial() {
        return material;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three Shirt objects and set collar sizes and sleeve lengths with user input
        Shirt shirt1 = new Shirt();
        System.out.println("Enter Collar Size for Shirt 1 (in inches): ");
        shirt1.setCollarSize(scanner.nextDouble());
        System.out.println("Enter Sleeve Length for Shirt 1 (in inches): ");
        shirt1.setSleeveLength(scanner.nextInt());

        Shirt shirt2 = new Shirt();
        System.out.println("Enter Collar Size for Shirt 2 (in inches): ");
        shirt2.setCollarSize(scanner.nextDouble());
        System.out.println("Enter Sleeve Length for Shirt 2 (in inches): ");
        shirt2.setSleeveLength(scanner.nextInt());

        Shirt shirt3 = new Shirt();
        System.out.println("Enter Collar Size for Shirt 3 (in inches): ");
        shirt3.setCollarSize(scanner.nextDouble());
        System.out.println("Enter Sleeve Length for Shirt 3 (in inches): ");
        shirt3.setSleeveLength(scanner.nextInt());

        // Display shirt information for each shirt
        System.out.println("\nShirt 1 Information:");
        System.out.println("Collar Size: " + shirt1.getCollarSize() + " inches");
        System.out.println("Sleeve Length: " + shirt1.getSleeveLength() + " inches");
        System.out.println("Material: " + Shirt.getMaterial());

        System.out.println("\nShirt 2 Information:");
        System.out.println("Collar Size: " + shirt2.getCollarSize() + " inches");
        System.out.println("Sleeve Length: " + shirt2.getSleeveLength() + " inches");
        System.out.println("Material: " + Shirt.getMaterial());

        System.out.println("\nShirt 3 Information:");
        System.out.println("Collar Size: " + shirt3.getCollarSize() + " inches");
        System.out.println("Sleeve Length: " + shirt3.getSleeveLength() + " inches");
        System.out.println("Material: " + Shirt.getMaterial());

        scanner.close();
    }
}

