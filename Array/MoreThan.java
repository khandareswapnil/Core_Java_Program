//more than n/2 time then print

import java.util.*;
public class MoreThan
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];
		
		System.out.println("Enter the Values of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}

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
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
				if(count==a.length/2)
				{
					System.out.printf("%d is appears more than %d times in the given array",a[i],count);
				}
			}
			else
			{
				count=1;
			}
		}
	}
}