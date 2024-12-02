// File Handlig Practice

import java.util.*;
import java.io.*;
public class FileHandlingPractice
{
	public static void main(String x[]) throws IOException
	{
		Scanner s=new Scanner(System.in);
		
		File f=new File("D:\\java\\PROGRAM\\File Handling\\DEMO4");
		
		if(f.exists())
		{
			System.out.println("Folder Already Created");
			System.out.println("TO CREATE THE FILE PRESS 1");
			System.out.println("TO BACK TO PROGRAM TO PRESS 2");
			
			System.out.println("ENTER THE CHOICE");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:
				AppWriteFile writeFile=new AppWriteFile(f,s);
				writeFile.creareFile();
					break;
				case 2:
					break;
				default :
				System.out.println("Enter the Wrong Value");
			}
		}
		else
		{
			if(f.mkdir())
			{
				System.out.println("Folder Created Sucessfully");
			}
			else
			{
				System.out.println("Error.........");
			}
		}
		
	}
}