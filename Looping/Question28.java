// Question 28

import java.util.*;
public class Question28
{
	public static void main(String x[])
	{
		int limit,sum=0;;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Limit");
		limit = s.nextInt();
		int flag=0;
		for(int i=2;i<limit;i++)
		{	
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			
			if(flag==0)
			{
				sum=sum+i;
			}
		}
		System.out.printf("The sum of 1 to %d prime number is %d",limit,sum);
	}
}
	
