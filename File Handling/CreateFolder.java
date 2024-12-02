// Create the folder using iostram

import java.io.*;
public class CreateFolder
{
	public static void main(String x[])
	{
		File f=new File("D:\\java\\PROGRAM\\File Handling\\Demo5");
		boolean b=f.exists();
		if(b)
			{
			System.out.println("File Is AlREADY EXISTS");
		}			
		else
		{
			boolean b1=f.mkdir();
			if(b1)
			{
				System.out.println("File Created Sucessfully");
			}
			else
			{
				System.out.println("Erro in created file..........");
			}
		}
		
	}
}