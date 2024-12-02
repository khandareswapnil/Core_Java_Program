// Question 3

import java.util.*;
class MergeTwoArray
{
	int a[],b[];
	void mergeTwo(int a[],int b[])
	{
		this.a=a;
		this.b=b;
		
	}
	void getMergeArray()
	{
		int c[]=new int[a.length+b.length];
		for(int i=0,k=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int j=0,k=a.length;j<b.length;j++)
		{
			c[k]=b[j];
			k++;
		}

		for(int k=0;k<c.length;k++)
		{
			System.out.printf("%d\t",c[k]);
		}
	}
}

public class Aquestion3
{
	public static void main(String x[])
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		size = s.nextInt();

		int a[] = new int[size];
		int b[] = new int[size];
		System.out.println("Enter the Value Of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		for(int i=0;i<a.length;i++)
		{
			b[i]=s.nextInt();
		}
		
		MergeTwoArray m = new MergeTwoArray();
		m.mergeTwo(a,b);
		m.getMergeArray();
		
	}
}