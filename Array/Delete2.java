// delete element in desired position

import java.util.*;
public class Delete2
{
	public static void main(String x[])
	{
		int a[],size,index;
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter the size of Array");
		size = s.nextInt();

		a = new int[size];
		System.out.println("Enter the Values of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("The Array values is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.println("\nEnter the index Where You Have Delete the Element");
		index =s.nextInt();		
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				count++;
				for(int k=i;k<a.length-1;k++)
				{
					a[k]=a[k+1];
				}
			}
		}
		System.out.println("After Deleting the Element\n");
		for(int i=0;i<a.length-count;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}