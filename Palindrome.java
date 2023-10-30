public class Palindrome {
    public static void main(String[] args) {
        String input = "racecar"; // Change this to the string you want to check

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // If characters don't match, it's not a palindrome
            }

            i++;
            j--;
        }

        return true; // If we reach here, it's a palindrome
    }
}
