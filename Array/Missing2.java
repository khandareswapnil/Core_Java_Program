// Missing Element

import java.util.*;
public class Missing2
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];
		
		System.out.printf("Enter the Values\n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.printf("The Array Values\n");
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
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("The Missing Element is ");
		for(int i=0;i<a.length;i++)
		{
			int start = a[i]+1;
			int end = a[i+1];
			for(int k=start;k<end;k++)
			{
				System.out.println(k);	
			}
		}
	}
}