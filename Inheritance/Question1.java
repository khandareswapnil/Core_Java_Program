// Question 1

import java.util.*;
public class Question1
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the Value");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		
		//int end=a.length-1;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}

		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
		}


		
	}
}