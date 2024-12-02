// to check the Totalspace and Free Space

import java.io.*;
public class ToCheckSpace
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		File f1[]=f.listFiles();
		for(int i=0;i<f.length;i++)
		{
			long totalSpace=f[i].getTotalSpace();
			long freeSpace=f[i].getFreeSpace();
			System.out.println(f[i] +"\t"+totalSpace/1073741824 +"GB");
			System.out.println(f[i] +"\t"+freeSpace/1073741824 +"GB");

		}
		
		for(int i=0;i<f1.length;i++)
		{
			System.out.println(f1[i]);
		}
	}
}