import java.io.*;


public class filehandler{
	
	public static void writeToFile(String filepath){
		try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("enter some text to write to file: ");
			String userInput = r.readLine();
		
	
			try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))){
				writer.write(userInput);
			 	System.out.println("\nfile has been written successfully");
			
			}catch(IOException e){
				System.out.println("Error writing to the file: "+ e.getMessage());
		
			}
		}catch(IOException e){
			System.out.println("Error reading user input: "+e.getMessage());
		}
		
	}
	public static void readFromFile(String filepath){
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			System.out.println("\nReading from the file:");
			
			String line;
			while((line=reader.readLine())!= null){
				System.out.println(line);
				
			}
		}catch(IOException e){
			System.out.println("Error reading from the file: "+e.getMessage());
		}
	}
	public static void main(String args[]){
		String filepath="EXample.txt";
		writeToFile(filepath);
		readFromFile(filepath);
		
	}
}
