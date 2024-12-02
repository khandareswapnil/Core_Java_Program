// 
import java.util.*;
public class xyz
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the Values");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("The Values Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(a[i]+"\t");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("\nAfter Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(a[i]+"\t");
		}
		
		
	}
}