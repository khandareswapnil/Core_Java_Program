// Question 1

import java.util.*;
public class Question1
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Entre the Size of Array");
		size = s.nextInt();
		a = new int[size];

		System.out.println("Enter the values of array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}

		System.out.println("Display the array");
		for(int i=0;i<a.lenggth;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}