import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFileWithLines{
	public static void main(String[] args){
		System.out.print("enter the  filepath to read from : ");
		String filepath = new Scanner(System.in).nextLine();
		
		display(filepath);
	}
	public static void display(String filepath){
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			System.out.println("Displaying file with line numbers:");
			int lineNo=1;
			String line;
			while((line =reader.readLine())!=null){
				System.out.println(lineNo +":"+ line);
				lineNo++;
			}
		}catch(IOException e){
			System.err.println("Error reading frmo fil: "+ e.getMessage());
		}
	}
	
}
