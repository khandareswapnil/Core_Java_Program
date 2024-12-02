// Question 33
import java.util.*;
public class Question33
{
	public static void main(String x[])
	{
		int no;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Limit");
		no = s.nextInt();
		
		for(int i=1;i<no;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
		if(sum==i)
		{
			System.out.println(i);
		}
		}
	}
}