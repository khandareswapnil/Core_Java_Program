// Question 7
// input: aBcD
// output:AbCd

import java.util.*;
public class Question7
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
		for(int i=0;i<len;i++)
		{
			if(ch[i]>=65 &&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		String str1=new String(ch);
		System.out.println(str1);
		}
}