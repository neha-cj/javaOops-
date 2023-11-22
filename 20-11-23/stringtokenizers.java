import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenizers
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of integers separated by spaces: ");
        String input = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);

        int sum = 0;
        System.out.println("Integers entered are:");
        while (tokenizer.hasMoreTokens()) 
        {
            String token = tokenizer.nextToken();
            int num = Integer.parseInt(token);
            System.out.println(num);
            sum += num;
        }

        System.out.println("Sum " + sum);
        sc.close();
    }
}
