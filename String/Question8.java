// Question 8

import java.util.*;
public class Question8
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
		
		int count=0;
		int count1=0;
		for(int i=0;i<len;i++)
		{
			if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("The Vowel Are "+count);
		System.out.println("The Consonant Are "+count1);

	}
}