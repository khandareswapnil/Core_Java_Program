// reverse array

import java.util.*;
class Reverse1
{
	public Reverse1(String str)
	{
		int end = str.length()-1;
		char[] c=str.toCharArray();
		for(int i=0;i<end;i++)
		{
			char temp=c[i];
			c[i]=c[end];
			c[end]=temp;
			end--;
		}
		String str1=new String(c);
		System.out.printf("%s",str1);
	}
}
	
public class ReverseApp1
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();

		Reverse r = new Reverse(str);
	}
}