// Question 10

import java.util.*;
public class Question10
{
	public static void main(String x[])
	{
		int num;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the num\t");
		num = s.nextInt();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	
		
	}
}