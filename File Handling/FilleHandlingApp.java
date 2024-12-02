// file handling app

import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FilleHandlingApp
{
	public static void main(String x[]) throws IOException
	{
		Scanner s=new Scanner(System.in);
		FileWriter f=new FileWriter("D:\\java\\PROGRAM\\File Handling\\Demo5\\text2.text",true);
		BufferedWriter bw=new BufferedWriter(f);
		
		System.out.println("Enter the String ");
		String str=s.nextLine();
		bw.write(str);
		bw.newLine();
		bw.close();
		f.close();
		System.out.println("Data Saved SucessFully......");
	}
}