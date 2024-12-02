// Question 1

import java.util.*;

class FindMax
{
	int a[];
	void setArray(int a[])
	{

		this.a=a;
	}
	void getMax()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}	
	}
	
}

public class Aquestion1
{
	public static void main(String x[])
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		size = s.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the Value Of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		FindMax f = new FindMax();
		f.setArray(a);
		f.getMax();
		
	}
}