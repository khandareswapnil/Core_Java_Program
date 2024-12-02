// Question 34

import java.util.*;
public class Question34
{
	public static void main(String x[])
	{
		int no,sum1=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		no = s.nextInt();
		int temp=no;
		while(no!=0)
		{	
			
			int rem=no%10;
			int sum=1;
			int i=1;
			while(i<=rem)
			{
				sum=sum*i;
				i++;
			}
			sum1=sum1+sum;
			no=no/10;
		}
		if(sum1==temp)
		{
			System.out.println("This number is Strong number");
		}
		else
		{
			System.out.println("This number is not Strong Number");
		}
	}
}