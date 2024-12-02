//Write a java program to create class name ReverseApp using contsructor name as :

import java.util.*;
class Reverse
{
	public Reverse(int a[])
	{
		int end=a.length-1;
		int mid=end/2;
		for(int i=0;i<mid;i++)
		{
			int temp = a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
	Reverse(String str)
	{
		char[] c = str.toCharArray();
		int end=str.length()-1;
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
public class ReverseApp
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=s.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the Values Of Array");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
	
		s.nextLine();
		System.out.println("Enter the String");
		String str=s.nextLine();
	
		Reverse r = new Reverse(str);
	}
}