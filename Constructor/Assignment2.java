
//Assignment 2

import java.util.*;
class AddAmount
{
	
	public AddAmount()	
	{
	}
	public AddAmount(int amount)
	{
		int final_amo=initial_amo+amount;
		System.out.println("The total Amount in Piggie Bank is "+final_amo);
	}
}
public class Assignment2
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount = s.nextInt();
		
		AddAmount a = new AddAmount(amount);
		
	}
}