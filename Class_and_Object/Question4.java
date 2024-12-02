// Question 4
import java.util.*;

class cArmstrong
{
	int num;
	void setValue(int num)
	{
		this.num=num;
	}
	
	void Armstrong()
	{
		int temp=num;
		int count=0;
		int sum=0;
		while(temp!=0)
		{
			++count;
			temp=temp/10;
		}
	
		temp = num;
		while(temp!=0)
		{
			int rem = temp%10;
			temp=temp/10;
			int i=1;
			int f=1;
			while(i<=count)
			{
				f=f*rem;
				i++;
			}
			sum=sum+f;
		}
		if(sum==num)
		{
			System.out.println("This is Armstrong Number");
		}
		else
		{
			System.out.println("This is Not Armstrong Number");
		}
	}
}
public class Question4
{
	public static void main(String x[])
	{
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num=s.nextInt();
		
		cArmstrong c = new cArmstrong();
		
		c.setValue(num);
		c.Armstrong();
		
	}
}