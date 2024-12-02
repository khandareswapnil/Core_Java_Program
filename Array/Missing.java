// missing element in array

import java.util.*;
public class Missing
{
	public static void main(String x[])
	{
		int a[],size,k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size Of Array");
		size = s.nextInt();
		a = new int[size];
		
		System.out.printf("\nEnter the Values\n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();	
		}
		System.out.println("The Values Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
				
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
				        a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		
		System.out.println("Missing Element\n");
		for( int i=0;i<a.length-1;i++)
		{
			
			
				int start=a[i]+1;
				int end = a[i+1];
			for(k=start;k<end;k++)
			{
				System.out.printf("%d\t",k);
			}
			

			
			
			
		}
	}
}