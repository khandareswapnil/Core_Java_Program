//Array is palindrom or not

import java.util.*;
public class Pallindrom
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
	
		System.out.println("Display the Value");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\n",a[i]);
		}

		int end =a.length-1;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
	
			if(a[i]==a[end])
			{
				flag=1;
				end--;
			}
			else
			{
				flag=0;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("The Array is not Pallidrome");
		}
		else
		{
			System.out.println("The Array is Pallidrome");
		}
	}
}