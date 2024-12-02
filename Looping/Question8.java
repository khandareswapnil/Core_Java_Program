// Question 8

import java.util.*;
public class Question8
{
	public static void main(String x[])
	{
		int size,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Size\t");
		size = s.nextInt();
		
		for(int i=1;i<=size;i++)
		{
			if(i%2==1)
			{
			sum=i+sum;
			}
		}
	
		System.out.printf("Sum of %d ODD number is %d",size,sum);
	}
}