// . WAP to create document file name as resume.doc and store student data in file like as 

import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class StudentApp
{
	public static void main(String x[]) throws IOException
	{
		Scanner s=new Scanner(System.in);
		FileWriter url=new FileWriter("D:\\java\\PROGRAM\\File Handling\\Demo2\\StudentApp.txt",true);
		BufferedWriter bw=new BufferedWriter(url);
		
		System.out.println("Enter the Name");
		String name=s.nextLine();
		System.out.println("Enter the Objective");
		String obj=s.nextLine();
		System.out.println("Enter the Skill Set");
		String skil=s.nextLine();
		System.out.println("Enter the Description");
		String des=s.nextLine();
		bw.write(name);
		bw.newLine();
		bw.write(obj);
		bw.newLine();
		bw.write(skil);
		bw.newLine();
		bw.write(des);

		bw.close();
		url.close();
		System.out.println("Info Sucessfully Submited");
		

	}
}


