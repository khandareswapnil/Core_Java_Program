// Question 12

import java.util.*;
public class Question12
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		
		int len=str.length();
		char ch[]=new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
		}
		int end=len-1;
		int flag=0;
		for(int i=0;i<len/2;i++)
		{
			if(ch[i]!=ch[end])
			{
				flag=1;
				break;
			}
			end--;
		}
		if(flag==1)
		{
			System.out.println("The String Is not Pallimdrom");
		}
		else
		{
			System.out.println("The String Is Pallimdrom");
		}
	}
}