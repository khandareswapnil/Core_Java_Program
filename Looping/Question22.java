// Question 22
import java.util.*;
public class Question22
{
	public static void main(String x[])
	{
		int no,sum=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		no = s.nextInt();
		
		int i=1;
		while(i<no)
		{
			if(no%i==0)
			{
				System.out.println(i);	
			}
			i++;
		}
	}
}