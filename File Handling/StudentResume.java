import java.util.*;
import java.io.*;

public class StudentResume
{
	public static void main(String x[]) throws IOException,Exception
	{
		Scanner s=new Scanner(System.in);
		File file=new File("D:\\java\\PROGRAM\\File Handling\\demo3\\Example.txt");
		file.createNewFile();
		
		FileWriter fr=new FileWriter(file);
		System.out.println("Enter the info");
		String str=s.nextLine();
		fr.write(str);
		fr.close();
		
		FileHandler fileHandler = new FileHandler();
		fileHandler.readerFile(file);
	}
}