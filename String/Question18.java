// Question 18

import java.util.*;
public class Question18
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
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		//String str1=new String(ch);
		//System.out.println(str1);
		
		int count=1;
		int max=0;
		int k=0;
		for(int i=0;i<len-1;i++)
		{			
			if(ch[i]==ch[i+1])
			{
				count++;
			}
			else 
			{
				if(max<count)
				
					max=count;
					
				}
				count=1;
			}
		}
		System.out.printf("%c======>%d",ch[k],max);
		
	}
}