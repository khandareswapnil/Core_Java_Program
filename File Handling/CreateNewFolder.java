// create New Folder

import java.io.*;
public class CreateNewFolder
{
	public static void main(String x[])
	{
		File f=new File("D:\\java\\PROGRAM\\File Handling\\demo");
		boolean b1=f.exists();
		if(b1)
		{
			System.out.println("Folder is already exits");
		}
		else
		{
			boolean b=f.mkdir();
			if(b)
			{
				System.out.println("Folder is created");
			}
			else{
				System.out.println("Folder is not Created");
			}
		}

	}
}