package fileHandling;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileHandling7 {

	public static void main(String[] args) {
	    FileSystem fs = FileSystems.getDefault();
	  //Path path = fs.getPath("C:\\JavaProgramming\\employees.txt");
	    Path path = fs.getPath("src/fileHandling/employees.txt");
	    System.out.println("Default Directory [" + path + "]"); 
	}//end method main

}//end class FileHandling7
