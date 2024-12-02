//  Question 2

import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=s.nextLine();
		int len=str.length();
		String str1;
		
		char c[]=new char[len];
		char c1[]=new char[len];
		
		for(int i=0;i<len;i++)
		{
			c[i]=str.charAt(i);
		}
		
		for(int i=0;i<len;i++)
		{
			c1[i]=c[i];
		}
		
		System.out.println("After coping the one String into Another String");
		str1=new String(c1);
		System.out.println(str1);
		
		
	}
}