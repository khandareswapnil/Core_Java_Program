// Second Largest element

import java.util.*;
public class SecondLargest
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
		
		System.out.println("Display The Array Values");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	
		for(int i=0;i<a.length;i++)	
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;
			}
			if(count==2)
			{
				System.out.printf("\nThe Second largest Number is %d",a[i+1]);
				break;
			}
		}
	}

}