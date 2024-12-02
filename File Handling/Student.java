// 

import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Student
{
	public static void main(String x[]) throws IOException
	{
		Scanner s=new Scanner(System.in);
		
		FileWriter f=new FileWriter("D:\\java\\PROGRAM\\File Handling\\Demo2\\test.txt",true);
		BufferedWriter bw=new BufferedWriter(f);
		String str=s.nextLine();
		bw.write(str);
		bw.newLine();
		bw.close();
		f.close();
		
		
		FileReader f1=new FileReader("D:\\java\\PROGRAM\\File Handling\\Demo2\\test.txt");
		BufferedReader br=new BufferedReader(f1);
		int data;
		while((data=br.read())!=-1)
		{
			char str1=(char)data;
			System.out.print(str1);
		}
	}
}