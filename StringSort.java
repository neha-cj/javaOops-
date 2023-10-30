import java.util.Scanner;
class StringSort{
 
    public static void sortStrings(String[] arr, int n)
    {
        String temp;
 
        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }
       
        sortStrings(strings, n);
        System.out.println("Strings in sorted order are : ");
        for (int i = 0; i < n; i++)
            System.out.println( strings[i]);
    }
}
