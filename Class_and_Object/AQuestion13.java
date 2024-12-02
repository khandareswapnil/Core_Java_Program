// Question 3 23/5 

import java.util.*;

class SortCharArray
{
	String st;
	void setCharArray(String st)
	{
		this.st=st;
	}
	void sort()
	{
		char a[] = st.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a);
	}
}
public class AQuestion13
{
	public static void main(String x[])
	{
		
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the Size");
		String st;
		st = s.nextLine();
		

		SortCharArray so = new SortCharArray();
		so.setCharArray(st);
		so.sort();
	}
}