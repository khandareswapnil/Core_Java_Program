// Question 1

import java.util.*;
public class Occurrence
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];

		System.out.println("Enter the Values Of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		System.out.println("Display The Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	
		int count;
		for(int i=0;i<size;i++)
		{
                             count=1;
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					count++;
                                            a[j]=-1;	
				}


				break;
			}
 if(a[i]!=-1)
{
System.out.printf("\n%d=========>%d\n",a[i],count);	
}

		}

 
	}


}
