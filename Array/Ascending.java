// Ascending Order

import java.util.*;
public class Ascending
{
	public static void main(String x[])
	{
		int a[],size,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size =s.nextInt();
		
		a = new int[size];

		System.out.println("Enter the Values Of Array");
		for(i=0;i<a.length;i++)
		{	
			a[i] = s.nextInt();
		}
		
		System.out.println("The Array Values");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("\t%d",a[i]);
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		System.out.println("\nAfter Ascending Order");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("\n%d",a[i]);
		}
}