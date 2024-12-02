// Question 2

import java.util.*;
public class Rotate
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		size = s.nextInt();
		a = new int[size];

		System.out.println("Enter the Array Value");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}

		System.out.println("Original  Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}

		System.out.println("\nEnter the index\n");
		int index = s.nextInt();

		for(int i=a.length-1;i>0;i++)
		{
			if(i==index)
			{
				a[i+1]=a[i];
				
			}
		}
		

	}
}
