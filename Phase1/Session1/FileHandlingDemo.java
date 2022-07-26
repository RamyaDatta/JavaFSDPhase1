package simplilearn.filehandlingproject;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class FileHandlingDemo {
	
	public static void createFileUsingFileClass() throws IOException
	{
		//create file
		File file= new File("G:\\files\\testprojectfile.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File  is already exist");
		}
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);
		
		writer.write("Hello!!!!!!!!!Welcome");
		writer.close();
		
		
	}
	public static void readFileReaderClass() throws IOException
	{ 
		FileReader reader= new FileReader("G:\\files\\testprojectfile.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
	}
	public static void AppendToFile() throws IOException
	{
		 
         
         FileWriter fileWritter = new FileWriter("G:\\files\\testprojectfile.txt",true);
         fileWritter.write("\nEveryone to Simplilearn");
         fileWritter.close();
         System.out.println("\nAppend done");
	}
	public static void main(String[] args) {
		try {
			 createFileUsingFileClass();
			 readFileReaderClass();
			 AppendToFile();
			 } catch (IOException e) {
			 e.printStackTrace();
		}
	}

}
