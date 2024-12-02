// Question 26
import java.util.*;
public class Question26
{
	public static void main(String x[])
	{
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num=s.nextInt();
		
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{

				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("This is Number is Prime Number");
		}
		else
		{	
			System.out.println("This is Not Prime Number");
		}
	}
}