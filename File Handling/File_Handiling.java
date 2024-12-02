// File Handling 

import java.io.*;
public class File_Handiling
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();		// to see directories
		for(int i=0;i<f.length;i++)
		{
			
			long totalSpace=f[i].getTotalSpace();  // to get total space
			long freeSpace=f[i].getFreeSpace();		// to get free  space
			System.out.println(f[i] + "\tTotal GB "+totalSpace/1073741824 +"\t" + "Free Space GB "+freeSpace/1073741824);
		}
		
		
		
	}
}