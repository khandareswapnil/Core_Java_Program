// 

import java.io.*;
public class CheckRoots
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		System.out.println("The Roots Are");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}