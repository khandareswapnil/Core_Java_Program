// Mearge array

import java.util.*;
public class Mearge
{
	public static void main(String x[])
	{
		int [] a,b,c;
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];
		b = new int[size];
		
		c = new int[size+size];
		//int len = c.length;
		//System.out.printf("%d",len);
		
		System.out.println("Enter the Value of first Array");
		for(int i=0;i<a.length;i++)
		{	
			a[i]=s.nextInt();
		}
		System.out.printf("The Values of first Array\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Enter the Value of Second Array");
		for(int i=0;i<b.length;i++)	
		{
			b[i]=s.nextInt();
		}

		System.out.println("The Values of Second Array is");
		for(int i=0;i<b.length;i++)
		{	
			System.out.println(b[i]);
		}


		for(int i=0,k=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		
		for(int i=0,k=size;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		System.out.println("The Meargr Array is");

		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}