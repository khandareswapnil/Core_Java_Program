// Question 1

import java.util.*;
public class Question1
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Siz eof array");
		size = s.nextInt();
		a = new int[size];
		
		System.out.println("Enter the Values of Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",i+1);
		}
		
		
	}
}