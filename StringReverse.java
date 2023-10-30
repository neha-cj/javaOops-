import java.util.*;
class StringReverse{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = scan.nextLine();
		String s2 = "";
		for(int i = s.length() - 1; i >= 0; i--){
			s2 += s.charAt(i);
			}
		System.out.println(s2);
		}	
	}
