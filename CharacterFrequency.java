import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("enter charcter to find");
        char chr = sc.next().charAt(0);  

        int fre = count(str,chr);

        System.out.println("The character '" + chr+ "' appears " + fre + " times in the string.");
    }

    public static int count(String str, char chr) {
        int fre = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                fre++;
            }
        }

        return fre;
    }
}
