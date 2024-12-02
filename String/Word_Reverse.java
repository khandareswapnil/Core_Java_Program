// Word Reverse

import java.util.*;
public class Word_Reverse
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=s.nextLine();
		
		int len=str.length();
		
		char[] a=str.toCharArray();
		int j=0;
		int start=0;
		int end=len-1;
		while(start<end)
		{
			char temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
		String reverse=new String(a);
		
		
		System.out.printf("%s",reverse);
	}
}