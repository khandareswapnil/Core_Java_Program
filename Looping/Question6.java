// Question 6

import java.util.*;
public class Question6
{
	public static void main(String x[])
	{
		int size,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Size\t");
		size = s.nextInt();
		
		for(int i=1;i<=size;i++)
		{
			sum=i+sum;
		}
	
		System.out.printf("Sum of %d Natural number is %d",size,sum);
	}
}