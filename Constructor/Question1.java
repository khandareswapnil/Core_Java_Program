//Assignment 1

import java.util.*;

class CheckDuck
{
	int no;
	CheckDuck(int no)
	{
		this.no=no;
	}
	
	boolean isDuck()
	{
		boolean flase;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==0)
			{
				return true;
			}
			no=no/10;
		}
		return false;
	}
	
}
public class Question1
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no= s.nextInt();
		
		CheckDuck c = new CheckDuck(no);
		boolean res=c.isDuck();
		if(res==true)
		{
			System.out.println("This is Duck Number");
		}
		else
		{
			System.out.println("This is not Duck Number");
		}
	}
}
