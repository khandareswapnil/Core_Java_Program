// Question 4

import java.util.*;
public class Question4
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Limit");
		size = s.nextInt();
	
		
		System.out.printf("Even Numbers are\n");
		for(int i=1;i<size;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%d\t",i);
			}
		}
	}
}