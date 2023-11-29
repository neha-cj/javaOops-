import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

public class FileInfo{
	public static void main(String[] args){
		System.out.print("enter the  filepath to read from : ");
		String filepath = new Scanner(System.in).nextLine();
		
		displayFile(filepath);
	}
	private static void displayFile(String filepath){
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			int chars=0;
			int linecount=0;
			int word=0;
			
			String line;
			while((line = reader.readLine())!=null){
				chars+=line.length();
				linecount++;
				StringTokenizer tokenizer = new StringTokenizer(line);
				word += tokenizer.countTokens();
				
				
			}
			System.out.println("File Statistics for "+filepath+ ":");
			System.out.println("number of characters: "+ chars);
			System.out.println("number of lines: "+linecount);
			System.out.println("number of words: "+word);
			
		}catch(IOException e){
			System.err.println("Error reading from the file: "+ e.getMessage());
		}
	}
}
