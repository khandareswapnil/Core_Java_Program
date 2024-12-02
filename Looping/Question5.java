// Question 5

import java.util.*;
public class Question5
{
	public static void main(String x[])
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Size\t");
		size = s.nextInt();
		System.out.printf("The Odd Number\n");
		for(int i=1;i<=size;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}