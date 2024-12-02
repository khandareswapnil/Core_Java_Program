//Question 13

import java.util.*;
public class Question13
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		int len=str.length();
		
		char ch[]=new char[len];
		char ch1[]=new char[len];
		
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
		}
		int end=len-1;
		for(int i=0;i<len/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[end];
			ch[end]=temp;
			end--;
		}
		for(int i=0;i<len;i++)
		{
			ch1[i]=ch[i];
		}
		
		int start=0;
		for(int i=0;i<=len;i++)
		{
			if( i==len ||ch1[i]==' ')
			{
				//System.out.println(i);
				int end1=i-1;
				while(start<end1)
				{
					char temp=ch1[start];
					ch1[start]=ch1[end1];
					ch1[end1]=temp;
					start++;
					end1--;
				}
				start=i+1;
			}
			
		}
		String str1=new String(ch1);
		System.out.println(str1);
		
	}
} 