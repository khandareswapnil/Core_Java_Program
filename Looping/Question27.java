// Question 27

import java.util.*;
public class Question27
{
	public static void main(String x[])
	{
		int limit;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Limit");
		limit = s.nextInt();
		int flag=0;
		for(int i=2;i<limit;i++)
		{	
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
}
	
