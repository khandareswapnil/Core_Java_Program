import java.io.*;

class FileHandler
{
	/*public File file;
	FileHandler()
	{
		this.file=file;
	}*/
	
	public void readerFile(File file) throws Exception
	{
		FileReader fr=new FileReader(file);
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}
} 

