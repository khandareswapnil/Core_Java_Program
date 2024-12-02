// Question 11

import java.util.*;
public class Question11
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
		int mid=len/2;
		for(int i=0;i<mid;i++)
		{
			char temp=ch[i];
			ch[i]=ch[end];
			ch[end]=temp;
			end--;
		}
		
		String str1=new String(ch);
		System.out.println(str1);
		
		
	}
}