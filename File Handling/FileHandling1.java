// 

import java.io.*;
import java.util.*;
public class FileHandling1
{
	public static void main(String x[])throws Exception
	{
		FileWriter f=new FileWriter("D:\\java\\PROGRAM\\File Handling\\demo\\first.txt");
		BufferedWriter fw=new BufferedWriter(f);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Data");
		String data=s.nextLine();
		fw.write(data);
		fw.newLine();
		fw.close();
		f.close();
		System.out.println("File Sucess.........");
		
		FileReader f1 =new FileReader("D:\\java\\PROGRAM\\File Handling\\demo\\first.txt");
		BufferedReader br=new BufferedReader(f1);
		String data1;
		while((data1=br.readLine())!=null)
		{
			
			System.out.print(data);
		}
		f1.close();
	}
}