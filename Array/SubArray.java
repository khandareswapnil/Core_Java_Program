// find Sub Array

import java.util.*;
public class SubArray
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];

		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("The origanl Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int start,end;
		System.out.println("Enter the Start");
		start = s.nextInt();
		System.out.println("Enter the End");
		end=s.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(a[i]);
		}
	}
}