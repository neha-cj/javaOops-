public class JavaFeaturesDisplay {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide feature names as command line arguments.");
            return;
        }

        for (String feature : args) {
            switch (feature.toLowerCase()) {
                case "platform independence":
                    System.out.println("Java is known for its platform independence.");
                    break;
                case "object-oriented":
                    System.out.println("Java is an object-oriented programming language.");
                    break;
                case "robust":
                    System.out.println("Java is designed to be robust, with features like strong type checking and exception handling.");
                    break;
                case "security":
                    System.out.println("Java has built-in security features like the sandbox environment.");
                    break;
                case "multithreading":
                    System.out.println("Java supports multithreading to allow concurrent execution.");
                    break;
                default:
                    System.out.println("Unknown feature: " + feature);
            }
        }
    }
}
// type this in console
java JavaFeaturesDisplay "platform independence" "object-oriented" "security"
