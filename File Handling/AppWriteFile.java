// Writer File

import java.io.*;
import java.util.*;
class AppWriteFile
{
	File f;
	Scanner s;
	AppWriteFile(File f,Scanner s)
	{
		this.f=f;
		this.s=s;
	}		
	
	void creareFile() throws IOException
	{
		File file=new File(f,"INFO.txt");
		if(file.exists())
		{
			System.out.println("File Already Created");
			System.out.println("ADD THE DATA IN FILE PRESS 1");
			System.out.println("SHOW THE DATA IN FILE PRESS 2");
			System.out.println("UPDATE THE DATA IN FILE PRESS 3");
			System.out.println("DELETE THE DATA IN FILE PRESS 4");
			System.out.println("Enter the Choice");
			int ch=s.nextInt();
			
			
			switch(ch)
			{
				case 1:
						AddData add=new AddData(file,s);
						add.addInfo();
					break;
				case 2:
						ShowData show=new ShowData(file);
						show.showInfo();
					break;
				case 3:
					UpdateData update=new UpdateData(file);
					update.updateInfo();
					break;
				case 4:
						DeleteData delete=new DeleteData(file);
						delete.deleteInfo();
					break;
				default:
				System.out.println("Enter Wrong Value");
				
			}
		}
		else
		{
			boolean b=file.createNewFile();
			if(b)
			{
				System.out.println("Created Sucessfully");
			}
			else
			{
				System.out.println("Error in Creation...");
			}

		}
	}
	
}