// insert the element in specified position

import java.util.*;
public class Insert
{
	public static void main(String x[])
	{
		int a[],i,size,value,index;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		size = s.nextInt();
		a = new int[size];
		System.out.println("Enter the values of Array");
		for(i=0;i<a.length-1;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("The Array Values Are");
		for(i=0;i<a.length-1;i++)
		{
			System.out.printf("\t%d",a[i]);
		}
		
		System.out.println("\nEnter the Value");
		value = s.nextInt();
		System.out.println("Enter the Index");
		index = s.nextInt();
		
		for(i=0;i<a.length;i++)
		{
			if(i == index)
			{
				int temp = a[index];
				a[index]=value;
				index++;
				value=temp;

			}
		}
		System.out.printf("\nAfter Adding The Value\n");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}