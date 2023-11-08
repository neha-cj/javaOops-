public class garbage {
    public static void main(String[] args) {
        // Create objects
        for (int i = 0; i < 5; i++) {
            new GarbageObject();
        }

        // Request garbage collection (This doesn't guarantee immediate collection)
        System.gc();

        // Simulate some work to give the garbage collector time to run
        for (int i = 0; i < 5; i++) {
            new GarbageObject();
        }

        // Request garbage collection again
        System.gc();

        // Display a message
        System.out.println("Garbage collection requested. The objects may be collected soon.");
    }
}

class GarbageObject {
    // Constructor
    public GarbageObject() {
        // Simulate some resource usage
        byte[] data = new byte[10];
    }

   @Override
    protected void finalize() {
        System.out.println("Object collected by the garbage collector.");
    }
}


