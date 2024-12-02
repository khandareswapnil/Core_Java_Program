// Question 32
import java.util.*;
public class Question32
{
	public static void main(String x[])
	{
		int no;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Number");
		 no = s.nextInt();
		 int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println("This number is Perfect number");
		}
		else
		{
			System.out.println("This number is not perfect number");
		}
	}
}