// Question 1

import java.util.*;

class CompareString
{
	String str;
	String str1;
	void setCharArray(String str,String str1)
	{
		this.str=str;
		this.str1=str1;
	}
	
	boolean compare()
	{
		char a[] = str.toCharArray();
		char b[] = str1.toCharArray();
		
		boolean flag=false;
			for(int i=0,k=0;i<a.length;i++,k++)
			{
				if(a[i]==b[k])
				{
					flag=true;
					
				}
				else
				{
					flag=false;
					break;
				}
			}
		
		return flag;
	}
}
public class Aquestion12
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First String");
		String str = s.nextLine();
	
		System.out.println("Enter the Second String");
		String str1 = s.nextLine();

		CompareString co = new CompareString();
		co.setCharArray(str,str1);
		boolean flag = co.compare();
		if(flag)
		{
			System.out.println("The Both String Are Equal");
		}
		else
		{
			System.out.println("The Both String Are Not Equal");
		}
		
	}
}