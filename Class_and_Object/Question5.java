// Question 5 

import java.util.*;

class Cstrong 
{
	int num;
	void setValue(int num)
	{
		this.num=num;
	}
	void strong()
	{
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			temp=temp/10;
			int i=1;
			int f=1;
			while(i<=rem)
			{
				f=f*i;
				i++;
			}
			sum=sum+f;
		}
		if(sum==num)
		{
			System.out.printf("This is Strong Number");
		}
		else
		{
			System.out.printf("This is Not Strong Number");
		}
	}
}
public class Question5
{
	public static void main(String x[])
	{
		int num;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		
		Cstrong c =new Cstrong();
		c.setValue(num);
		c.strong();
	}
}