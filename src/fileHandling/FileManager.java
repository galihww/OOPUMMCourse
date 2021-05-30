package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        //memanggil method untuk membaca file dan isi file
        readFile("src/fileHandling/filetext.txt");

//        //memanggil method untuk mengganti nama file
//        try {
//            renameFile("src/fileHandling/filetext.txt","src/fileHandling/newfiletext.txt");
//        } catch (FileAlreadyExistsException e) {
//            e.printStackTrace();
//        }

//        //memanggil method untuk menghapus file
//        deleteFile("src/fileHandling/newfiletext.txt");

    }

    public static void readFile(String pathFile){
        try {
            File myObj = new File(pathFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void renameFile(String oldName, String newName) throws FileAlreadyExistsException {
        File oldFile = new File(oldName);
        File newFile = new File(newName);

        if (newFile.exists()){
            System.out.println("File sudah ada");
        }else{
            boolean success = oldFile.renameTo(newFile);
            System.out.println("File "+ oldFile.getName() +" berhasil di rename menjadi "+ newFile.getName());
            if (!success)
                System.out.println("proses rename gagal");
        }
    }

    public static void deleteFile(String deleteFile){
        try
        {
            File del= new File(deleteFile);
            if(del.delete())
            {
                System.out.println("File "+ del.getName() + " berhasil dihapus");
            }
            else
            {
                System.out.println("Proses delete file gagal");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
