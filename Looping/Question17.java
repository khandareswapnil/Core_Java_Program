// Question 17
import java.util.*;
public class Question17
{
	public static void main(String x[])
	{
		int no,sum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		no = s.nextInt();
		int temp=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		if(sum==temp)
		{
			System.out.println("The  Number Pallindrom is "+sum);
		}
		else
		{
			
			System.out.println("The not Number Pallindrom is "+sum);
		}
	}
}