package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations 
{

	public void writeFileData(String filePath) throws IOException
	{
		File f=new File(filePath);
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		b.write("third line of the file");
		b.newLine();
		b.write("fourth line of the file");
		b.close(); // for saving and closing the file
	}
	
	
   public void readFileData(String filePath) throws IOException
   {
	File f=new File(filePath);
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	String s;
	while((s=b.readLine())!=null)
	{
		System.out.println(s);
	}
	
   }
   public static void main(String[] args) throws IOException {
	FileOperations f=new FileOperations();
	f.writeFileData("../Project_1/hello.txt");
}
}
