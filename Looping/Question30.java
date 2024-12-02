//Question 30
import java.util.*;
public class Question30
{
	public static void main(String x[])
	{
		int no,i,temp,rem,sum,sum1=0;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Number");
		 no = s.nextInt();
		 temp=no;
		int count=0;
		while(temp!=0)
		{
			++count;
			temp=temp/10;
		}
		
		temp=no;
		//System.out.printf("%d",count);
		while(temp!=0)
		{	
			rem=temp%10;
			temp=temp/10;
			 i=1;
			 sum=1;
			while(i<=count)
			{
				sum=sum*rem;
				i++;
			}
			//System.out.printf("%d\n",sum);
			sum1=sum1+sum;
		}
		//System.out.printf("%d",sum1);
		if(sum1==no)
		{
			System.out.println("This is Armstrong Number");
		}
		else
		{
			System.out.println("This is not Armstrong Number");
		}
	}
}