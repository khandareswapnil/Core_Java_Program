// majority element in array

import java.util.*;
public class Majority
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = s.nextInt();
		a = new int[size];
		
		System.out.println("Enter the Values of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Display the Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
		}
		
		int count = 1;
		int flag=0;
		for(int i=0;i<a.length-1;i++)
		{	
			if(a[i]==a[i+1])
			{
				count++;
			}
			if(count==(a.length/2))
			{
				System.out.printf("\n%d is The amjority Element",a[i]);
				flag=1;
				break;
				

			}
		}
		if(flag==0)
		{
			System.out.printf("\nThere is no majority Element Are Present");
		}
	}
}