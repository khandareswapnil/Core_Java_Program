// Question 3

import java.util.*;
import java.util.*;
public class Question3
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=s.nextLine();
		int len=str.length();
		System.out.println("Enter the Second String ");
		String str1=s.nextLine();
		int len1=str1.length();
		String str3=str.concat(str1);
		System.out.println(str3);
		
		char ch[]=new char[len];
		char ch1[]=new char[len1];
		
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
			ch1[i]=str1.charAt(i);
		}
		
		char ch3[]=new char[len+len1];
		int k=0;
		for(int i=0;i<len;i++)
		{
			ch3[k++]=ch[i];
			
		}
		for(int i=0;i<len1;i++)
		{
			ch3[k++]=ch1[i];
		}
		
		String str4=String.valueOf(ch3);
		System.out.println(str3);
		

		
		
	}
}
