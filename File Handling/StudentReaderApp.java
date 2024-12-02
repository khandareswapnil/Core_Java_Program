//

import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class StudentReaderApp
{
	public static void main(String x[]) throws IOException
	{
		FileReader f1=new FileReader("D:\\java\\PROGRAM\\File Handling\\Demo2\\StudentApp.txt");
		BufferedReader br=new BufferedReader(f1);
		int data;
		while((data=br.read())!=-1)
		{
			char str1=(char)data;
			System.out.print(str1);
		}
	}
	
}