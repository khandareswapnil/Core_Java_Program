//Q3. Write a java program to create class name as OccurenceApp using contsructor name as :

import java.util.*;
class Occurence
{
	public Occurence(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				System.out.printf("%d=======%d",a[i],count);
			}
			else if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				System.out.printf("%d=======%d\n",a[i],count);
				count=1;
			}
		}

	}
}
public class OccurenceApp
{
	public static void main(String x[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = s.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the Vlaues of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		Occurence o = new Occurence(a);
	}
}