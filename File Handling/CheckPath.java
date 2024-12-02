// Check how many file and Folder are present in Path

import java.io.*;
public class CheckPath
{
	public static void main(String x[])
	{
		File f=new File("D:\\java\\PROGRAM\\File Handling");
		File list[]=f.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isDirectory())
			{
			System.out.println(list[i]);
			}
		}
	}
}
