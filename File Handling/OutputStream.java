// 
import java.io.*;
import java.util.*;
import java.io.FileOutputStream;
public class OutputStream
{
	public static void main(String x[]) throws Exception
	{
		Scanner s=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("D:\\java\\PROGRAM\\File Handling\\Demo4\\example.txt",true);
		System.out.println("Enter the data in file");
		String str=s.nextLine();
		byte b[]=str.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("DATA SAVE SUCESSFULLY..........");
		
	}
}