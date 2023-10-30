import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();

        if (isPalindrome(s)) {
            System.out.println("'" + s + "' is a palindrome.");
        } else {
            System.out.println("'" + s + "' is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }

            i++;
            j--;
        }

        return true; 
    }
}
