// jagged 2 

import java.util.*;
public class Jagged2
{
	public static void main(String x[])
	{
		int a[][]=new int[3][];
		Scanner s = new Scanner(System.in);
		a[0]=new int[5];
		a[1]=new int[4];
		a[2]=new int[2];
	
		System.out.printf("Enter the Vlaues of Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		System.out.println("Display the Values");
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