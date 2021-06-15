package fileHandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {
	public static void main(String[] args) throws IOException {
		Path dirPath = Paths.get("src/fileHandling");
		Path usersfilePath = Paths.get("Highscores.txt");
		Path settingsfilePath = Paths.get("Settings.txt");
		Path users, settings;
		users = checkFiles(dirPath, usersfilePath);
		settings = checkFiles(dirPath, settingsfilePath);
		if(users!=null)
			displayFileStatus(users, settings);
		//endif
		deleteFile(settings);
	}// end main method

	static void deleteFile(Path filePath) {
	      //This will delete the file/directory if it exists.
	      try {
	          if(Files.exists(filePath)){
	             Files.delete(filePath);
	             System.out.println(filePath.toString()+ " deleted!");
	          }
	          else
	             System.out.println(filePath.toString()+ " not found!");
	          //endif
	      }//end try
	      catch(DirectoryNotEmptyException e) {
	    	  System.err.println("The directory is not empty");
	      }//end catch
	      catch (IOException x) {
	         System.err.println(x);
	     }//end catch
	}//end method deleteFile
	
	
	static void displayFileStatus(Path users, Path settings) throws IOException {
		System.out.println("Readable  : " + Files.isReadable(users));		
		System.out.println("Writeable : " + Files.isWritable(users));		
		System.out.println("Executable: " + Files.isExecutable(users));
		System.out.println("Hidden    : " + Files.isHidden(users));		
		System.out.println("Same files: " + Files.isSameFile(users, settings)); 
	}//end method displayFileStatus
	
	static Path checkFiles(Path dirPath, Path filePath) {
		Path absPath = dirPath.resolve(filePath);
		try {
		   if(Files.notExists(dirPath))
		      Files.createDirectories(dirPath);
		   //endif         
		   if(Files.notExists(absPath))
		      Files.createFile(absPath);
		   //endif
		} //end try
		catch (IOException x) {
		    System.err.println(x);
		    return null;
		} //end catch
		return absPath;
	}//end method checkFiles
	
}//end of class FilesDemo

