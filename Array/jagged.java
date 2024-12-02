// jagged array

import java.util.*;
public class Jagged
{
	public static void main(String x[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int a[][]= new int[3][];
		a[0]=new int[3];
		a[1] = new int[4];
		a[2] = new int[2];

		System.out.println("Enter the value of array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		System.out.println("\nDisplay the jagged Array\n");
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