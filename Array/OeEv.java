// seperate odd and even integer in array

import java.util.*;
public class OeEv
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];
		
		System.out.println("Enter the Value of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("The Array Value is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Odd Number\n");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.printf("%d\t",a[i]);
			}
		}

		System.out.println("\nEven Number\n");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}