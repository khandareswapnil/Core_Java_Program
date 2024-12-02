// Question 23
import java.util.*;
public class Question23
{
	public static void main(String x[])
	{
		int no,sum=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		no = s.nextInt();
		int i=1;
		while(i<=no)
		{
			sum=sum*i;
			i++;
		}
		System.out.printf("Fcctorial of The Given Number is  %d",sum);
	}
}