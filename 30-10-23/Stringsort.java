import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        // Sort the array of strings in alphabetical order
        Arrays.sort(strings);

        System.out.println("Sorted strings:");

        for (String str : strings) {
            System.out.println(str);
        }

        sc.close();
    }
}
