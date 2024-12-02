// Question 10

import java.util.*;
public class Question10
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
		int count=1;
		for(int i=0;i<len;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}