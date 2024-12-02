//Question 35

import java.util.*;
public class Question35
{
	public static void main(String x[])
	{
		int no,sum1=0,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Limit");
		no = s.nextInt();
		
		
		for(int i=1;i<no;i++)
		{		
			 temp=i;
			sum1=0;
			while(temp!=0)
			{
				int rem=temp%10;
				int j=1,sum=1;
				while(j<=rem)
				{
					sum=sum*j;
					j++;

				}
				sum1=sum1+sum;
				temp=temp/10;
			}
		if(sum1==i)
		{
			System.out.println(i);
		}
		}
	}
}