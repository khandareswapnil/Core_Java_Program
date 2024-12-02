// Question 15
import java.util.*;
public class Question15
{
	public static void main(String x[])
	{
		int no,mul=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		no = s.nextInt();
		
		while(no!=0)
		{
			int rem=no%10;
			mul=mul*rem;	
			no=no/10;
		}
		System.out.println("the Product of number is "+mul);
	}
}