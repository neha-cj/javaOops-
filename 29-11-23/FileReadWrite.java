import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileReadWrite{
	public static void main(String args[]){
		System.out.print("enter the input filepath: ");
		String inputfile = new Scanner(System.in).nextLine();
	
		System.out.print("Enter the output file path: ");
		String outputfile =new Scanner(System.in).nextLine();
		
		readFile(inputfile);
		writefile(outputfile);
		
	}
	public static void readFile(String inputfile){
		try(FileInputStream istr = new FileInputStream(inputfile)){
		System.out.println("Reading from the Input file: ");
		int data;
		while((data = istr.read())!=-1){
			System.out.println((char)data);
		}
		
		}catch(IOException e){
			System.err.println("Error reading from the file: "+ e.getMessage());
		}
	}
	public static void writefile(String outputfile){
		try(FileOutputStream ostr= new FileOutputStream(outputfile)){
			String content="Hello, this is a file handling example in java\n"+
			"It demonstrates how to read from a file and write to another file.\n"+
			"hello java!!";
			
			ostr.write(content.getBytes());
			System.out.println("\nOutPut File has been written succesfully.");
			
		}catch(IOException e){
			System.err.println("Error writing to the file: "+e.getMessage());
		}
	}
}
