class Shirt2 {
    double collarSize;
    int sleeveLength;
     static String material = "cotton";


    public Shirt(double collarSize, int sleeveLength) {
        this.collarSize = collarSize;
        this.sleeveLength = sleeveLength;
    }


    public  static String getMaterial() {
        return material;
    }


    public double getCollarSize() {
        return collarSize;
    }


    public int getSleeveLength() {
        return sleeveLength;
    }
}

 class testshirt {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt(16.5, 32);
        Shirt shirt2 = new Shirt(15.0, 34);
        Shirt shirt3 = new Shirt(17.0, 36);


        System.out.println("Shirt 1 Details:");
        System.out.println("Collar Size: " + shirt1.getCollarSize());
        System.out.println("Sleeve Length: " + shirt1.getSleeveLength());
        System.out.println("Material: " + Shirt.getMaterial());
        System.out.println();

        System.out.println("Shirt 2 Details:");
        System.out.println("Collar Size: " + shirt2.getCollarSize());
        System.out.println("Sleeve Length: " + shirt2.getSleeveLength());
        System.out.println("Material: " + Shirt.getMaterial());
        System.out.println();

        System.out.println("Shirt 3 Details:");
        System.out.println("Collar Size: " + shirt3.getCollarSize());
        System.out.println("Sleeve Length: " + shirt3.getSleeveLength());
        System.out.println("Material: " + Shirt.getMaterial());
    }
}
