// Question 16
import java.util.*;
public class Question16
{
	public static void main(String x[])
	{
		int no,sum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		no = s.nextInt();
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		System.out.println("The Reverse Number is "+sum);
	}
}