// Create New File Using File Handling

import java.io.*;
public class CreateFile
{
	public static void main(String x[]) throws Exception
	{
		File f=new File("D:\\java\\PROGRAM\\File Handling\\Demo5\\text.txt");
		
		if(f.exists())
		{
			System.out.println("File Is Already Created");
		}
		else
		{
			if(f.createNewFile())
			{
				System.out.println("Save Created Sucess.....");
			}
			else{
				System.out.println("Error in created.......");
			}
		}
		
	}
}