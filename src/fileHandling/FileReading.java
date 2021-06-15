package fileHandling;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) {
		
		ArrayList<String> employees = new ArrayList<>();
		readFile(employees);
		displayEmployees(employees);	
	}//end method main
	
	static void displayEmployees(ArrayList<String> employees) {
		for(String employee: employees)
			System.out.println(employee);
	}//end method displayEmployees
	
	static void readFile(ArrayList<String> employees) {
		String line = "";	
		BufferedReader fileInput = null;
		try { 
			   fileInput = new BufferedReader(new FileReader(new File("src/fileHandling/employees.txt")));
			   line = fileInput.readLine();
			   while (line != null) {
		    	  employees.add(line);
			      line = fileInput.readLine();
			   }//endwhile
			   fileInput.close(); 
			}//end try
		    catch(FileNotFoundException e) {
			   System.out.println("File not found");
		    }//end catch
			catch(EOFException eofe) {
			   System.out.println("No more lines to read.");
			}//end catch
	 	    catch(IOException ioe) {
			   System.out.println("Error reading file.");
			}//end catch
	}//end method readFile
	
}//end class FileReading

/*

	static void readFile(ArrayList<String> employees) {
		String line = "";	
	
		try { 
		   BufferedReader fileInput = new BufferedReader(new FileReader(new File("src/fileHandling/employees.txt")));
		   line = fileInput.readLine();
		   fileContent = line + "\n";
		   while (line != null) {
		      line = fileInput.readLine();
		      if (line != null)
		    	  employees.add(line);
		         //fileContent += line + "\n";
		      //endif
		   }//endwhile
		   fileInput.close(); 
		}//end try
		catch(EOFException eofe) {
		   System.out.println("No more lines to read.");
		   System.exit(0); 
		}//end catch
 	    catch(IOException ioe) {
		   System.out.println("Error reading file.");
		   System.exit(0); 
		}//end catch
	}//end method readFile


*/