// Question 14
import java.util.*;
public class Questio16
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
				if(ch[i]<ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		int count=1;
		for(int i=0;i<len-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				System.out.printf("%c=====>%d\n",ch[i],count);
				count=1;
			}
		}
	}
}