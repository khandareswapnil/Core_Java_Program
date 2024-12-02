// Assignment 5

import java.util.*;
class ArrParent
{
	protected int a[];
	void setValue(int a[])
	{
		this.a=a;
	}
	void arrangeSeq()
	{
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
}

class ArrengeAscendingOrder extends ArrParent
{
	void arrangeSeq()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Ascending Order\n");
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
}

class ReverseArray extends ArrParent
{
	void arrangeSeq()
	{
		int end=5-1;
		int mid=5/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
		
		System.out.println("Reverse Array\n");
		
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
}

public class OverridingApp
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		int p[]=new int[5];
		System.out.println("Enter the vlaues of array");
		for(int i=0;i<5;i++)
		{
			p[i]=s.nextInt();
		}

		ArrengeAscendingOrder a= new ArrengeAscendingOrder();
		a.setValue(p);
		a.arrangeSeq();
		
		ReverseArray r = new ReverseArray();
		r.setValue(p);
		r.arrangeSeq();
	}
}