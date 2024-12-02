//Question 31
import java.util.*;
public class Question31
{
	public static void main(String x[])
	{
		int no,i,temp,count=0,rem,sum,sum1=0;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Number");
		 no = s.nextInt();
		
		temp=no;
		while(temp!=0)
		{
			temp=temp/10;
			count++;	
		}
		temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			temp=temp/10;
			sum=1;
			i=1;
			while(i<=count)
			{
				sum=sum*rem;
				i++;	
			}
			sum1=sum1+sum;	
		}
		if(sum1==no)
		{
			System.out.printf("Armstrong");
		}
		else
		{
			System.out.printf("Not Armstrong");	
		}
		
	}	
}