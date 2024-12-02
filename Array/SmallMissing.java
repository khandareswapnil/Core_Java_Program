// smallest missing element in array

import java.util.*;
public class SmallMissing
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a= new int[size];

		System.out.println("Enter the Array Values");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Display The Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			int start = a[i]+1;
			int end = a[i+1];
			for(int k =start;k<end;k++)
			{
				System.out.printf("The Smallest Element Missing Element is %d",k);
				break;
			}
			break;
		}
	}	
}