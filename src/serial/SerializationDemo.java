package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
	   //Course course = new Course("Java Programming", "Oracle", "JP", 60);
	   ArrayList<Course> courses = new ArrayList<>();
	   Path dirPath = Paths.get("C:/JavaProgramming");
	   Path usersfilePath = Paths.get("details.ser");
	   Path absPath = dirPath.resolve(usersfilePath);
	  
	   if(Files.notExists(absPath)){
		   Files.createDirectories(dirPath);
		   Files.createFile(absPath);
		   fillArray(courses);
	   }
	   else
		   courses = deSerializeData(absPath);//pass the object to deSerializeData
	   //endif

	   serializeData(courses, absPath);//pass the object to serializeData

	   if(courses.size()>0)
	      displayData(courses);
	   //endif
	}//end method main

	static void fillArray(ArrayList<Course> courses){
		courses.add(new Course("Java Foundations", "Oracle", "JFo", 60));
		courses.add(new Course("Java Fundamentals", "Oracle", "JFu", 60));
		courses.add(new Course("Java Programming", "Oracle", "JPr", 60));
		courses.add(new Course("Database Foundations", "Oracle", "DFo", 60));
		courses.add(new Course("Database Design and Programming with SQL", "Oracle", "DDP", 60));
	}//end method fillArray
	
	static void serializeData(ArrayList<Course> courses, Path path){
		
		try(FileOutputStream fileOut = new FileOutputStream(path.toString());
		    ObjectOutputStream objOut = new ObjectOutputStream(fileOut))
		{//try writing to the file
           objOut.writeObject(courses);
		   System.out.println("Serialized data is saved in " + path.toString());
		}//end try
		catch(IOException e)
		{
		   e.printStackTrace();
		}//end catch 
	}//end method serializeData


   static ArrayList<Course> deSerializeData(Path path){
	   ArrayList<Course> courses = new ArrayList<>();
	   try(FileInputStream fileIn = new FileInputStream(path.toString());
           ObjectInputStream objIn = new ObjectInputStream(fileIn))
      {//try reading the file  
         courses = (ArrayList<Course>) objIn.readObject();
         return courses;
      }//end try
      catch(ClassNotFoundException e)
      {//catch any error where the class is not found
         System.out.println("Course class not found");
      }//end catch
      catch(IOException i)
      {//catch any IO exception error that is thrown
         i.printStackTrace();
      }//end catch
	return null;
}//end method deSerializeData


   public static void displayData(ArrayList<Course> courses){
     //display the contents of the class to screen
     System.out.println("Deserialized Course Details...");
     for(Course course: courses)
    	 System.out.println(course);
     //endfor
   }//end method displayData


}//end class SerializationDemo
