public class StringReverse {
    public static void main(String[] args) {
        String input = "Hello, World!"; // Change this to the string you want to reverse

        String reversed = reverseString(input);

        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        int length = str.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
