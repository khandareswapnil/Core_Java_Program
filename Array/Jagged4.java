// jagged Array

import java.util.*;
public class Jagged4
{
	public static void main(String x[])
	{
		int a[][],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array row");
		size = s.nextInt();
		a = new int[size][];
		
		int sizec;
		for(int i=0;i<a.length;i++)
		{	
			System.out.printf("Enter the size %d of Column",i);
			sizec = s.nextInt();
			a[i] = new int[sizec];
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
		
	}
}