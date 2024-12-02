

import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;

public class BufferedWriterExample

{
	public static void main(String x[]) throws IOException
	{
		Scanner s=new Scanner(System.in);
		
		FileWriter f=new FileWriter("D:\\java\\PROGRAM\\File Handling\\Demo2\\test.txt",true);
		BufferedWriter bw=new BufferedWriter(f);
		System.out.println("Enter the String");
		String data=s.nextLine();
		
		bw.write(data);
		bw.newLine();
		bw.close();
		f.close();
		
		FileReader f1=new FileReader("D:\\java\\PROGRAM\\File Handling\\Demo2\\test.txt");
		BufferedReader bf=new BufferedReader(f1);
		
		int data1;
		while((data1=bf.read())!=-1)
		{
			char ch=(char)data1;
			System.out.print(ch);
		}
		
	}
}