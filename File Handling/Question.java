// file handling Question


// 3. show free space in directories
// 4.create folder in directories

import java.io.*;
public class Question
{
	public static void main(String x[])
	{
		// 1. show root directories 
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			long totalSpace=f[i].getTotalSpace();
			long freeSpace=f[i].getFreeSpace();
			
			System.out.println(f[i]+"\t"+"TotalSpace "+totalSpace/1073741824 +"\t" +"FreeSpace "+freeSpace/1073741824);
		}
		// 2. show space in directories 

		File f1=new File("D:\\java\\PROGRAM\\File Handling\\Demo2");
		boolean b=f1.exists();
		if(b)
		{
			System.out.println("Folder Is Alredy Created");
		}
		else
		{
			boolean c=f1.mkdir();
			if(c)
			{
				System.out.println("Folder Created");
			}
			else
			{
				System.out.println("Folder Not Created");
			}
		}
	}
}