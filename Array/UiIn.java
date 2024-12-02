// Union And Intersection of Array

import java.util.*;
public class UiIn
{
	public static void main(String x[])
	{
		int a[],b[],c[],size;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];
		b = new int[size];
		c = new int[size+size];
		
		int len = c.length;

		System.out.println("Enter the First Array Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		System.out.println("Enter the Second Array Value");
		for(int j=0;j<a.length;j++)
		{
			b[j]=s.nextInt();
		}

		System.out.println("First Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.println("\nSecond Array");
		for(int j=0;j<a.length;j++)
		{
			System.out.printf("%d\t",b[j]);
		}
		
	
		System.out.printf("\nThe Union of Array\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]!=b[j])
				{
					System.out.printf("%d\t",a[i]);
				}
			}
		}

		System.out.printf("\n");
		
		for(int i=0,k=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int j=0,k=size;j<b.length;j++)
		{
			c[k]=b[j];
			k++;
		}
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len-1;j++)
			if(c[i]>c[j])
			{
				int temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
		
		
		for(int i=0;i<len;i++)
		{
			if(c[i]==c[i+1])
			{
				for(int k=i;k<len-1;k++)
				{
					c[k]=c[k+1];
				}
				len--;
			}
		}
		System.out.printf("\nIntersection\n");
		for(int i=0;i<len;i++)
		{
			System.out.printf("%d\t",c[i]);
		}
		
	}
}
