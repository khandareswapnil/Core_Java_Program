// File Reading APP

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadingAPP
{
	public static void main(String x[]) throws IOException
	{
			FileReader f1=new FileReader("D:\\java\\PROGRAM\\File Handling\\Demo5\\text2.text");
			int data;
			int count=0;
			while((data=f1.read())!=-1)
			{
				if((char)data=='a'||(char)data=='i'||(char)data=='e'||(char)data=='o'||(char)data=='u')
				{
					++count;
					System.out.print((char)data);
				}
				
			}
			System.out.println(count);
			
	}
}

