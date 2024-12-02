// Question 4

import java.util.*;
public class Question4
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		System.out.println("Enter the Second String");
		String str2=s.nextLine();
		
		int res=str.compareTo(str2);
		if(res==0)
		{
			System.out.println("Both String Are Equal");
		}
		else
		{
			System.out.println("Both String Are not Equal");
		}
	}
}