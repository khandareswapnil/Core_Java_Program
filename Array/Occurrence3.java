// occurance

import java.util.*;
public class Occurrence3
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];

		System.out.println("Enter the Values of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();	
		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				System.out.printf("%d======>%d\n",count,a[i]);
				break;
			}
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				System.out.printf("%d======>%d\n",count,a[i]);
				count=1;
			}
		}
	}
}