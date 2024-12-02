// inheritence Question 3

import java.util.*;

class ArrSum
{
	protected int a[];
	protected int size;
	void setValue(int a[],int size)
	{
		this.a=a;
		this.size=size;
	}
}

class GetSum extends ArrSum
{
	int getSum()
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}
public class Assignment3
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the Values of Array");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		GetSum g=new GetSum();
		g.setValue(a,size);
		int sum = g.getSum();
		System.out.println("The Sum of Array is\t"+sum);
		
	}
}