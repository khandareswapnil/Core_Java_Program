// insert the element 

import java.util.*;
public class Insert2
{
	public static void main(String x[])
	{
		int a[],value,index,size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = s.nextInt();
		a = new int[size];
		
		System.out.println("Enter the Values Of Array");
		for(int i=0;i<a.length-1;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("The Array Is");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.printf("%d\n",a[i]);
		}

		System.out.println("Enter the Index number");
		index = s.nextInt();
		
		System.out.println("Enter the Value");
		value = s.nextInt();


		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				int temp = a[index];
				a[index]=value;
				index++;
				value=temp;
			}
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}	
}